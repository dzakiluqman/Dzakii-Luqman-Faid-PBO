/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author usER
 */
public class Main {
    public static void main(String[] args) {

        // Membuat objek Pengarang (AGREGASI → independen)
        Pengarang p1 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang p2 = new Pengarang("Tere Liye");

        // Membuat perpustakaan (KOMPOSISI)
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Membuat buku yang memiliki pengarang (AGREGASI)
        Buku b1 = new Buku("Bumi Manusia", p1);
        Buku b2 = new Buku("Rembulan Tenggelam di Wajahmu", p2);

        // Menambahkan buku ke perpustakaan (KOMPOSISI)
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);

        // Menampilkan informasi perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
