// TUGAS 2 PEMROGRAMAN LANJUT SI A
// Nama : Farida Choirun Nisa 
// NIM  : 235150401111001

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] a) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>(); // ArrayList untuk menyimpan objek Mahasiswa

        Scanner scanner = new Scanner(System.in); // Scanner untuk membaca input dari terminal
        boolean next = true;
        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();

            // Membuat objek Mahasiswa baru dan menambahkannya ke ArrayList
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            mahasiswas.add(mahasiswa);

            System.out.print("tambah lagi? (y/t) ");
            String tambah = scanner.nextLine();

            // Cek apakah pengguna ingin menambahkan data lagi
            if (tambah.equals("t")) {
                next = false; // Jika tidak ingin menambahkan lagi, hentikan perulangan
            }
        }

        // Menutup scanner
        scanner.close();
        
        System.out.println("==================================");
        // Menampilkan informasi mahasiswa yang telah dimasukkan
        for (Mahasiswa mahasiswa : mahasiswas) {
            mahasiswa.tampilkanInfo();
        }
    }
}
