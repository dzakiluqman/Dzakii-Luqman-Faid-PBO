/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author usER
 */
public class MainTotal {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Laptop ASUS", 8000000));
        keranjang.tambahProduk(new Pakaian("Kaos Polos", 150000));

        keranjang.tampilkanDaftar();

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}
