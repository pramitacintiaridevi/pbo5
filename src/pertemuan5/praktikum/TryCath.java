package pertemuan5.praktikum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCath {
    public static void main(String[] args) {
        // Opens a file
        File file = new File("C:\\Paimon.txt");

        // Tries to open said file
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read file berhasil");
        }

        // If file not found
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

