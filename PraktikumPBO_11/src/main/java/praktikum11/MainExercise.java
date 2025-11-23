/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author usER
 */
public class MainExercise {
    public static void main(String[] args) {

        // Studi kasus Komposisi
        PerpustakaanExercise p = new PerpustakaanExercise();
        p.tambahBuku(new BukuExericse("Pemrograman Java"));
        p.tambahBuku(new BukuExericse("Struktur Data"));
        p.infoPerpustakaan();

        System.out.println();

        // Studi kasus Agregasi
        Klub klub = new Klub("Klub Programing");
        klub.tambahAnggota(new Anggota("Luqman"));
        klub.tambahAnggota(new Anggota("Aldi"));
        klub.infoKlub();
    }
}
