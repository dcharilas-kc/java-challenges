## RuntimeErrorExample

We’re getting an `ArrayIndexOutOfBoundsException`, and we can see that we’re trying to access index -1, which causes an error because the index can’t be negative.

## ArrayCounter

Remember that arrays are 0-based, so the first index is always 0, not 1. So this loop actually starts at the second index, and it skips the first number! To fix the logic error, we need to make the loop start at 0.

## LineSegment

We’re getting an `NullPointerException`. You can see that the points have values inside the main() function, and the parameters are passed correctly. But then the class-level variables aren’t set, which is why they’re null when we call the getLength() function. So something is wrong with how we’re setting the class-level variables using the parameter variables.

## ForLoopError

Notice that the semicolon appears immediately after the for statement, rather than after the code block as it should. Instead of printing individual values of Count, this example prints a single sentence that says Count is 11.

## Fahrenheit

You will get Fahrenheit 67 degrees, which is wrong. It should be 95.0. In Java, the division for integers is the quotient—the fractional part is truncated—so in Java 9 / 5 is 1. To get the correct result, you need to use 9.0 / 5, which results in 1.8.