## TreePut

Map.put() operation returns the value if key is already present in map. After adding key “test key 3”, when again try to add it, it returns the value “test value 3”.
When you add “test key 4” first time, it is no present in map, so map return’s it’s value is null.

## OuterClass

Prints 1020. Inner class defined above though, have access to the private variable data of OuterClass, but declaring a variable data inside an inner class 
makes it specific to the Inner class with no conflicts in terms of variable declaration.

## Increment

The result is ‘0’. When placed after a variable, the ++ operator functions as the postfix increment operator: the value of the expression j++ is the 
original value of j before it was incremented.

## MoreNames

The problem is that MoreNames has no programmer-declared constructor. What it does have is a void-returning instance method called MoreNames, which the author 
probably intended as a constructor. Unfortunately, the presence of a return type (void) turned the intended constructor declaration into a method declaration, 
and the method never gets invoked. Because the MoreNames has no programmer-declared constructor, the compiler generates a public parameterless constructor that 
does nothing beyond initializing the fields of the instance that it creates. When the size method is invoked on this HashMap, it returns 0, and that is what 
the program prints.

## PingPong

The program always prints PongPing. Strange as it may seem, this is not a multi-threaded program. It does create a second thread, but it never starts that thread. 
Instead, the main thread simply invokes the run method of the new Thread instance, and the run method executes synchronously in the main thread.
The lesson is simple: Be careful not to invoke a thread’s run method when you mean to invoke its start method.

## Twisted

Twisted—all the local, inner, nested, and anonymous classes can access one another’s members without any restrictions. With that understanding, you might expect 
the program to print reproduce, because it invokes printName on the instance new Twisted("reproduce"), which  passes the string "reproduce" to its superclass 
constructor to be stored in its name field. The printName method invokes the name method, which returns the contents of this field. 

But if you ran the program, you found that it prints main. The intuition behind this behavior is that private members are never inherited. In this case, 
the name method is not inherited into the anonymous class in reproduce. Therefore, the printName invocation in the anonymous class must refer to the method in 
the enclosing ("main") instance rather than the current ("reproduce") instance.