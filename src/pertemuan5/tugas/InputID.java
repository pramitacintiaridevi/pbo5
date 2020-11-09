package pertemuan5.tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputID {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        // Deklarasi array dan inisiasi panjang array 10
        int[] array = new int[10];

        System.out.println("<--- Pelangaaan --->");
        System.out.print("Jumlah Pengunjung Toko\t: ");
        int jmlPengunjung = scan.nextInt();

        System.out.println("Masukkan Data Pengunjung\t: ");
        for (int i = 0; i < jmlPengunjung; i++) {
            try {
                System.out.print("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Data ke-" + i + " : " + array[i] + " terdaftar");
            } catch (InputMismatchException e) {
                System.out.println("Inputkan Angka !!!");
                i--;

                // Pernyataan disini akan di eksekusi jika terjadi Exception saat jumlah pengunjung lebih dari 10
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Maksimal Jumlah Pengunjung 10");
            }
        }

        System.out.println();
        System.out.println("Lihat Data Pengunjung\t: ");
        // Input indeks untuk mencari UID pengunjung
        System.out.print("Indeks\t: ");
        int datadata = scan.nextInt();
        System.out.println("Data ke-" + datadata + " : " + array[datadata]);

        boolean cek = false;
        do {
            // input jika ingin melihat lagi atau tidak
            System.out.print("Lihat Lagi? (y/n)\t: ");
            String lihat = scan.next();
            // Jika YA maka akan mengeksekusi program ini
            if (lihat.equals("y") || lihat.equals("Y")) {
                System.out.println("Lihat Data Pengunjung\t: ");
                System.out.print("Indeks\t: ");
                datadata = scan.nextInt();
                System.out.println("Data ke-" + datadata + " : " + array[datadata]);

            } else {
                cek = true;
            }
        } while (!cek);

    }

    // Method intInputMethod
    public static int intInputMethod () {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

}
