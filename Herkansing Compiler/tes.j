.class public HelloWorld
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 98
ldc 2
ldc 8
if_icmpgt then
    ldc 3
goto endif
then:
    ldc 2
endif:

  return
.end method
