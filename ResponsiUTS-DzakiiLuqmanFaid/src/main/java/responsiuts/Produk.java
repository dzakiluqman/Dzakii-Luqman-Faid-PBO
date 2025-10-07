/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts;

/**
 *
 * @author usER
 */
public class Produk {
    // Enkapsulasi private
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Metode getter dan setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        // Menggunakan format String untuk menampilkan harga tanpa E-notasi
        System.out.println("Harga: " + String.format("%.0f", harga)); 
    }
}
