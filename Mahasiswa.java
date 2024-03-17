// TUGAS 2 PEMROGRAMAN LANJUT SI A
// Nama : Farida Choirun Nisa 
// NIM  : 235150401111001

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;

    // Konstruktor
    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println(nim + " | " + nama + " | " + alamat);
    }
}