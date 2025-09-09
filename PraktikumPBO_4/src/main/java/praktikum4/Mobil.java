/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Mobil extends Kendaraan {
    private int jumlahPintu; // atribut tambahan

    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // panggil constructor superclass
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // bisa akses kecepatanMaks (protected), jenisMesin (public)
        System.out.println("Mobil: " + getNama());
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

