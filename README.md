# Exception Handling Multi Catch


**Objective**

In this project we will learn, how you can catch more than one type of exception with one exception handler, with the `multi-catch` concept.


**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Multi-Catching Exceptions|   [Multi-Catching Exceptions Concept](https://dev.java/learn/exceptions/catching-handling/#multi-catching)|
|The Finally Block | [Finally Block Concept](https://dev.java/learn/exceptions/catching-handling/#finally)  |
|Multi catch & Finally |[ Mult catch & Finally (Tutorial)](https://www.youtube.com/watch?v=X5urP793On8)|


**Problem**

Enhance the code issues using exception handling.

**Implementation**

 We have two issues, numbers divide by zero and index out of bounds you must handle it.
 

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
> Add the following code to the previous code after completed, and see what different is.


```java
 finally {
            System.out.println("finally");
        }
```
