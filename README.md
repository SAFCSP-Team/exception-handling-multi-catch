# Exception-Handling-Multi-catch


**Objective**

In this project we will learn, You can catch more than one type of exception with one exception handler, with the `multi-catch` pattern.


**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Multi-Catching Exceptions|   [Multi-Catching Exceptions](https://dev.java/learn/exceptions/catching-handling/#multi-catching)|
|The Finally Block | [The Finally Block](https://dev.java/learn/exceptions/catching-handling/#finally)  |
|Tutorial|[Try catch & Finally](https://www.youtube.com/watch?v=1XAfapkBQjk)|


**Problem**

We have catch two types of exceptions to handle the code.

Enhance the code issues using exception handling.

**Implementation**

 We have two issues, numbers divide by zero and index out of bounds you must handle it by using multi catch.

```Java

public class Main {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int b = 0;
     
            System.out.println("1");
            int c = (array[2] / b);
            System.out.println("2");
             }



   finally {
            System.out.println("finally");
        }
}
```

