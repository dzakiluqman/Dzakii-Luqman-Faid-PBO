/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts;

/**
 *
 * @author usER
 */
public class Main {
    public static void main(String[] args) {
        
        // Produk Elektronik
        System.out.println("Produk Elektronik");
        Produk laptop = new Elektronik("Laptop MSI", 17000000, 3); 
        laptop.tampilkanInfo(); 
        // Enter di output
        System.out.printf("%n");
        // Pegawai Tetap
        System.out.println("Pegawai Tetap");
        Pegawai arifin = new PegawaiTetap("Arifin", 3000000, 500000); 
        arifin.tampilkanInfo(); 
        
        // Enter di output
        System.out.printf("%n");
        // Polimorfisme
        // Makanan
        Produk roti = new Makanan("Roti", 5000, "2025-11-11");
        
        // Pegawai Kontrak
        Pegawai gunawan = new PegawaiKontrak("Gunawan", 2500000, 6);
        
        // Memanggil output Roti
        System.out.printf("Makanan%n");
        roti.tampilkanInfo(); 
        
        // Enter di output
        System.out.printf("%n");
        
        // Memanggil output Gunawan
        System.out.printf("Pegawai Kontrak%n");
        gunawan.tampilkanInfo(); 
    }
}
