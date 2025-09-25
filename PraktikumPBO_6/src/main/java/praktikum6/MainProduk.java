/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author usER
 */
public class MainProduk {
    public static void main(String[] args) {
        Produk buku = new Buku("Pemrograman Java", 100000);
        System.out.println("Harga Buku setelah diskon: " + buku.getHargaSetelahDiskon());
    }
}
