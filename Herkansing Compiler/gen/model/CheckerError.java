package model;

public class CheckerError {
    private int lineNumber;
    private String errorMessage;

    public CheckerError(int lineNumber, String errorMessage) {
        this.lineNumber = lineNumber;
        this.errorMessage = errorMessage;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return getLineNumber() + ": " + getErrorMessage();
    }
}
