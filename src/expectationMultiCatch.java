public class expectationMultiCatch {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int zero = 0;
        try{
            System.out.println("before divide");
            int result = (array[4] / zero);
            System.out.println("after divide");
             }catch(ArithmeticException e){
                System.out.println("Divided by zero operation cannot possible");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of range");
        }
}}
