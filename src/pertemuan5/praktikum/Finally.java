package pertemuan5.praktikum;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            // Tries to access the 6th index of a 5 indexed array
            System.out.println("Nilai index 'array' ke-6: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Prints out the exception
            System.out.println(e.getMessage());
        } finally {
            // Gets the value of the last index in the array
            int last = array[array.length - 1] = 10;

            // Prints out said value
            System.out.println("Nilai array index terakhir adalah " + last);
        }
    }
}
