/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.List;
import java.util.ArrayList;

class KeranjangBelanja {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public void tampilkanDaftar() {
        for (Produk p : daftarProduk) {
            System.out.println("Produk: " + p.nama);
            System.out.println("Harga: " + p.harga);
            System.out.println("Diskon: " + p.hitungDiskon());
            System.out.println("Harga setelah diskon: " + p.getHargaSetelahDiskon());
            System.out.println();
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }
}
