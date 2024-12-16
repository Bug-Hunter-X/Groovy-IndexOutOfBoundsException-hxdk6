# Groovy IndexOutOfBoundsException Bug

This repository demonstrates a common error in Groovy: the `IndexOutOfBoundsException` that occurs when trying to access an element in a list or array using an index that is out of range.

The `bug.groovy` file contains code that will throw this exception.  The `bugSolution.groovy` file provides a solution to avoid the error.

## How to reproduce

1. Clone this repository.
2. Run `groovy bug.groovy`.

You'll see the exception in the console.

## Solution

Check array/list bounds before accessing elements, use the `getAt()` method which handles boundary cases gracefully, or use a try-catch block.