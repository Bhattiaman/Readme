public class ex { // Changed class name from Exception to Main
    public static void main(String[] args) {
        // Try-Catch in exception handling

        int[] marks = {34, 43, 54}; // Array with 3 elements
        try {
            System.out.println(marks[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) { // Catch the specific exception
            System.out.println("Array index is out of bounds: " + e);
        } catch (Exception e) { // Catch any other exceptions
            System.out.println("An error occurred: " + e);
        }
        
        // This will still run even after an exception
        System.out.println("Code ran successfully");
    }
}
