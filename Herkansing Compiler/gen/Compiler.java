import jasmin.ClassFile;
import model.Scope;
import model.VariableSymbol;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.*;

/**
 * Compiles source code in a custom language into Jasmin and then assembles a
 * JVM-compatible .class file.
 * <p>
 * Check the TODO's.
 */
public class Compiler {
    /**
     * Thrown when the generated Jasmin code is not accepted by Jasmin.
     */
    public class AssembleException extends Exception {
        public AssembleException(String msg, Exception innerException) {
            super(msg, innerException);
        }
    }

    /**
     * The number of errors detected by the lexer and parser.
     */
    private int errorCount = 0;

    /**
     * Compiles a complete source code file.
     *
     * @param inputPath      Path to the source code to compile.
     * @param jasminFileName Path to the file where the Jasmin assembly will be stored.
     * @param classFileName  Path to the class file.
     * @throws IOException       if files could not be read or written
     * @throws AssembleException if Jasmin code was not valid
     */
    public void compileFile(String inputPath, String jasminFileName, String classFileName)
            throws IOException, AssembleException {
        compile(CharStreams.fromFileName(inputPath), jasminFileName, classFileName);
    }

    /**
     * Compiles a string.
     *
     * @param sourceCode     The source code to compile.
     * @param jasminFileName Path to the file where the Jasmin assembly will be stored.
     * @param classFileName  Path to the class file to write.
     * @throws IOException       if files could not be read or written
     * @throws AssembleException if Jasmin code was not valid
     */
    public void compileString(String sourceCode, String jasminFileName, String classFileName)
            throws IOException, AssembleException {
        compile(CharStreams.fromString(sourceCode), jasminFileName, classFileName);
    }

    /**
     * Compiles a file. The source code is lexed (turned into tokens), parsed (a parse tree
     * created) then Jasmin code is generated and assembled into a class.
     *
     * @param input          Stream to the source code input.
     * @param jasminFileName Path to the file where the Jasmin assembly will be stored.
     * @param classFileName  Path to the class file to write.
     * @throws IOException       if files could not be read or written
     * @throws AssembleException if Jasmin code was not valid
     */
    private void compile(CharStream input, String jasminFileName, String classFileName)
            throws IOException, AssembleException {
        // Phase 1: Run the lexer
        CommonTokenStream tokens = runLexer(input);

        // Phase 2: Run the parser
        ParseTree parseTree = runParser(tokens);
        ParseTreeProperty<VariableSymbol> parseTreeProperty = new ParseTreeProperty<>();
        Scope currentScope = new Scope(parseTreeProperty);
        // ANTLR tries to do its best in creating a parse tree, even if the source code contains
        // errors. So, check if that is the case and bail out if so.
        if (errorCount > 0)
            return;

        // Phase 3: Check the source code for semantic errors
        if (!runChecker(parseTree,currentScope,parseTreeProperty))
            return;

        // Phase 4: Generate code
        String jasminCode = generateCode(parseTree,parseTreeProperty);

        // Phase 5a: Write code to a jasmin file
        BufferedWriter jasminOut = new BufferedWriter(new FileWriter(jasminFileName));
        jasminOut.write(jasminCode);
        jasminOut.close();

        // Phase 5b: Assemble into a class file
        assembleClassFile(jasminCode, classFileName);
    }

    /**
     * Take the charater input and turn it into tokens according to the grammar.
     *
     * @param input The input.
     * @return A steam of tokens.
     */
    private CommonTokenStream runLexer(CharStream input) {
        GameOfThronesLangLexer lexer = new GameOfThronesLangLexer(input);  // TODO: Replace lexer with the one for your own language
        lexer.addErrorListener(getErrorListener());
        return new CommonTokenStream(lexer);
    }

    /**
     * Tries to form a parse tree from the given tokens. In case of errors, the error listener is
     * called, but the parser still tries to create a parse tree.
     *
     * @param tokens The tokens returned from the lexer.
     * @return A Parse Tree.
     */
    private ParseTree runParser(CommonTokenStream tokens) {
        GameOfThronesLangParser parser = new GameOfThronesLangParser(tokens);  // TODO: Replace parser with the one for your own language
        parser.addErrorListener(getErrorListener());
        return parser.winteriscoming();       // TODO: Replace .program() with your own start symbol
    }

    /**
     * Called to check if the source code was semantically correct. This method is only called when
     * there were no syntax errors.
     *
     * @param parseTree The parse tree generated by the parser
     * @param scope
     * @param parseTreeProperty
     * @return True if all code is semantically correct
     */
    private boolean runChecker(ParseTree parseTree, Scope scope, ParseTreeProperty<VariableSymbol> parseTreeProperty) {
        TypeChecker typeChecker = new TypeChecker(scope,parseTreeProperty);
        typeChecker.visit(parseTree);
        if (typeChecker.errors.size() != 0) {
            System.out.println("ERRORS:");
            typeChecker.errors.forEach(System.out::println);
            return false;
        }
        return true;
    }

    /**
     * Generate the Jasmin code for the source code. This method is only called after checking that
     * the code is syntactically and semantically correct, so you need not check for any errors.
     *
     * @param parseTree The parseTree to generate code for
     * @param parseTreeProperty
     * @return All Jasmin code that is generated
     */
    private String generateCode(ParseTree parseTree, ParseTreeProperty<VariableSymbol> parseTreeProperty) {
        StringWriter str = new StringWriter();
        PrintWriter out = new PrintWriter(str);
        out.println(".class public HelloWorld");
        out.println(".super java/lang/Object");

        out.println();
        out.println(".method public static main([Ljava/lang/String;)V");
        out.println(".limit stack 99");
        out.println(".limit locals 98");

        GameOfThronesVisitor visitor = new GameOfThronesVisitor(out,parseTreeProperty);
        visitor.visit(parseTree);
        out.println();
        out.println("  return");
        out.println(".end method");
        System.out.println(str.toString());
        return str.toString();
    }

    /**
     * Assembles Jasmin code into a (hopefully valid) JVM-compatible class file.
     *
     * @param jasminCode    The Jasmin code to assemble.
     * @param classFileName Filename of the class to write.
     * @throws IOException       if file could not be written
     * @throws AssembleException if Jasmin code was not valid
     */
    private void assembleClassFile(String jasminCode, String classFileName)
            throws IOException, AssembleException {
        try {
            ClassFile classFile = new ClassFile();

            // Read in the jasmin code
            BufferedReader input = new BufferedReader(new StringReader(jasminCode));
            classFile.readJasmin(input, classFileName, true);
            input.close();

            // Write to a class
            FileOutputStream classOut = new FileOutputStream(classFileName);
            classFile.write(classOut);
        } catch (IOException ioe) {
            throw ioe;
        } catch (Exception e) {
            // Jasmin just uses Exception in the exception specification, which is quite ugly
            // Let's wrap it in a more specific Exception.
            throw new AssembleException(e.getMessage(), e);
        }
    }

    /**
     * Creates and returns an error listener for use in the lexer and parser that just increases
     * the errorCount-attribute in this class so we can find out if the source code had a syntax
     * error.
     *
     * @return An error listener for use with lexer.addErrorListener() and parser.addErrorListener()
     */
    private ANTLRErrorListener getErrorListener() {
        return new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                errorCount++;
            }
        };
    }

    /**
     * Main method.
     *
     * @param args Array of command line arguments. You can use this to supply the file name to
     *             compile.
     */
    public static void main(String[] args) {
        try {
            Compiler compiler = new Compiler();

            // Check that the user supplied a name of the source file
            if (args.length == 0) {
                // For testing, you can compile a hard coded string here
                System.err.println("Compiling hard coded string!");
                compiler.compileString("hello;", "HelloWorld.j", "HelloWorld.class");
            } else {
                // From the source code path, strip off the extension and create file name for the
                // Jasmin and class file
                String sourceCodePath = args[0];
                int dotIndex = sourceCodePath.lastIndexOf('.');
                if (dotIndex == -1)
                    dotIndex = sourceCodePath.length();

                String jasminPath = sourceCodePath.substring(0, dotIndex - 1) + ".j";
                String classPath = sourceCodePath.substring(0, dotIndex - 1) + ".class";

                // Compile the source code
                compiler.compileFile(sourceCodePath, jasminPath, classPath);
            }
        } catch (IOException | AssembleException e) {
            e.printStackTrace();
        }
    }
}
