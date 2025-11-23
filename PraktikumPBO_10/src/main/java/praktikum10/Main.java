/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author usER
 */
public class Main {
    public static void main(String[] args) {

        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaLaptop = 5000000;
        double hargaSnack = 15000;

        System.out.println("Pajak Laptop: " + elektronik.hitungPajak(hargaLaptop));
        System.out.println("Pajak Snack: " + makanan.hitungPajak(hargaSnack));
    }
}
