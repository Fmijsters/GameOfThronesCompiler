.class public HelloWorld
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 3
  getstatic java/lang/System/out Ljava/io/PrintStream;
ldc [ldc 1, ldc 1, iadd]
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
  return
.end method
