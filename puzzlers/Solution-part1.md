## HelloGoodbye

This program will only print "Hello World".

It is true that a finally is executed when a try block completes execution whether normally or abruptly. In this program, however, the try block does not complete 
execution at all. The System.exit method halts the execution of the current thread and all others dead in their tracks. The presence of a finally clause does not 
give a method special permission to continue executing.

When System.exit is called, the virtual machine performs two cleanup tasks before shutting down. First, it executes all shutdown hooks that have been registered 
with Runtime.addShutdownHook. This is useful to release resources external to the VM. Use shutdown hook for behavior that must occur before the VM exits.

## Elementary

Take a careful look at the two operands of the + operator. We are adding the int value 12345 to the long value 5432l. Always use a capital el (L) in long literals, 
never a lowercase el (l).

## Confusing

Apparently, this is a question on overloading. Which method is called by main method? The answer is the second one: Confusing(double[]).

There are two phases in Java’s overload resolution process:

- selects all the methods or constructors that are accessible and applicable;
- selects the most specific of the methods or constructors selected in the first phase.
In our program, both constructors are applicable and accessible, but Confusing(Object) is less specific as accepts any parameter passed to Confusing(Object). 
- The key to understanding this puzzle is that the test for which method or constructors is most specific does not use the actual parameters: the parameters 
- appearing in the invocation (e.g., null in this case).

## Bark

Both woofer and nipper are declared with Dog, but nipper is initializer with Basenji constructor. The method bark is Basenji is defined to do nothing. 
So nipper.bark() will print nothing. Is this true?

No. You will see two Woof on the screen.

The problem is that bark is a static method, and there is no dynamic dispatch on static methods. When a program calls a static method, the method to be invoked 
is selected at compile time, based on the compile-time type of the qualifier, which is the name we give to the part of the method invocation expression to the 
left of the dot. In this program, both woofer and nipper are declared to be of type Dog and they have to same compile-time type, the compiler causes the same 
method to be invoked: Dog.bark. It does not matter that the runtime type of nipper is Basenji; only compile-time type is considered.

## Indecisive

In a try-finally statement, the finally block is always executed when control leaves the try block. This is true whether the try block completes normally or abruptly.
Abrupt completion of a statement or block occurs when it throws an exception, executes a break or continue to an enclosing statement, or executes a return from the 
method as in this program.

These are called abrupt completions because they prevent the program from executing the next statement in sequence.

When both the try block and the finally block complete abruptly, the reason for the abrupt completion in the try block is discarded, and the whole try-finally statement 
completes abruptly for the same reason as the finally block.

In this program, the abrupt completion caused by the return statement in the try block is discarded, and the try-finally statement completes abruptly because of 
the return statement in the finally block. Simply put, the program tries to return true but finally it returns false.

## BigProblem

You might think that this program prints 555000. After all, it sets total to the BigInteger representation for 0 and then adds 5,000, 50,000, and 500,000. If you
ran the program, you found that it doesn’t print 555000 but 0. Apparently all that addition has no effect on total.

There is a good reason for this: BigInteger instances are immutable. So are instances of String, BigDecimal, and the wrapper types: Integer, Long, Short, 
Byte, Character, Boolean, Float, and Double. You can’t change their values.

Instead of modifying existing instances, operations on these types return new instances.