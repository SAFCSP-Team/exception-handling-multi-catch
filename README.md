# Exception Handling Multi Catch


**Objective**

In this project, we will learn how you can catch more than one type of exception with one exception handler, with the `multi-catch` concept.


**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Multi-Catching Exceptions|   [Multi-Catching Exceptions document](https://dev.java/learn/exceptions/catching-handling/#multi-catching)|
|The Finally Block | [Finally Block document](https://dev.java/learn/exceptions/catching-handling/#finally)  |
|Multi catch & Finally |[ Mult catch & Finally (Tutorial)](https://www.youtube.com/watch?v=X5urP793On8)|


**Problem**

resolve the code errors using exception handling.

**Implementation**

 We have two errors, numbers divided by zero and index out of bounds you must handle it.
 

```java

public class Main {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int zero = 0;
     
            System.out.println("before divide");
            int result = (array[2] / zero);
            System.out.println("after divide");
             }
}
```
> Add the Finally block to the previous code after completed, and see what difference is.


```java
 finally {
            System.out.println("finally");
        }
```
