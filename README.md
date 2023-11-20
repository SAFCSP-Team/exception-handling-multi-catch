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






```Java

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        /* Adding students */
        Student student1 = new Student("Khaled", 1, 20, 85.5);
        sms.addStudent(student1);

        Student student2 = new Student("Rema", 2, 21, 92.3);
        sms.addStudent(student2);

        Student student3 = new Student("Noura", 3, 19, 78.9);
        sms.addStudent(student3);
         }
}
```

