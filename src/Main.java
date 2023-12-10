public class Main {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int zero = 0;
     
            System.out.println("before divide");
            try {
                int result = (array[2] / zero);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
            System.out.println("finally");
            }
            
            System.out.println("after divide");
             }
}

