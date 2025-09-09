/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Buat objek kendaraan
        Kendaraan mobil = new Kendaraan("Toyota Avanza", 180, "Bensin");

        // Menampilkan data awal
        System.out.println("Nama: " + mobil.getNama());
        System.out.println("Kecepatan Maks: " + mobil.kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + mobil.jenisMesin);

        // Mengubah data dengan setter
        mobil.setNama("Toyota Innova");
        mobil.kecepatanMaks = 200;   // karena protected → bisa diakses di package yang sama
        mobil.jenisMesin = "Diesel"; // karena public → bisa diakses dari mana saja

        // Menampilkan data setelah perubahan
        System.out.println("\nSetelah diubah:");
        mobil.tampilkanInfoKendaraan();

        // Uji subclass Mobil
        Mobil mobilSport = new Mobil("Honda Civic", 220, "Turbo", 4);
        mobilSport.tampilkanInfoKendaraan();
        mobilSport.tampilkanInfoMobil();
    }
}

