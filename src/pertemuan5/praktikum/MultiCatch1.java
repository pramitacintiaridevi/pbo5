package pertemuan5.praktikum;

public class MultiCatch1 {
    public static void main(String[] args) {
        // Creates an array with 5 indexes
        float[] testArray = new float[5];

        try {
            testArray[7] = 1;       // Out of bounds
            testArray[2] = 30 / 0;    // Division by zero
            System.out.println("No errors!");
        }

        // If program catches any of these exceptions
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}