/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Main {
    public static void main(String[] args) {
        // Object pertama
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        mobil1.startEngine();
        mobil1.displayInfo();

        // Object kedua
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");
        mobil2.startEngine();
        mobil2.displayInfo();

        // Modifikasi atribut (ubah warna)
        mobil1.gantiWarna("Merah");
        mobil1.displayInfo();

        mobil2.gantiWarna("Biru");
        mobil2.displayInfo();
    }
}

