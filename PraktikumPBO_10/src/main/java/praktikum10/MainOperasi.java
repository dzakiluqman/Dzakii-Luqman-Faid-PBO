/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author usER
 */
public class MainOperasi {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " +
        penjumlahan.hitung(10, 5));
        
        // Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " +
        pengurangan.hitung(10, 5));
    }
}
