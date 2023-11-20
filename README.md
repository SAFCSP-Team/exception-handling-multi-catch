# Exception-Handling-Multi-catch


**Objective**

In this project we will learn, A multi-catch block to provide a more concise and streamlined approach for handling multiple exceptions in a single catch block.


**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
||  |
|     |      |


**Problem**

we have to handle two different exceptions but take the same action for both.


**Implementation**

 we have two issues numbers divideByZero and index out of bounds you must handle it by using multi catch.

```Java

public class Main {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int b = 0;
     
            System.out.println("1");
            int c = (array[2] / b);
            System.out.println("2");
             }
}
```

