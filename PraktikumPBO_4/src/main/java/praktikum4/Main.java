/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Programmer", 7500000);

        // Menampilkan informasi awal pekerja
        System.out.println("Informasi awal:");
        System.out.println(pekerja1);

        // Mengubah nama menggunakan setter
        pekerja1.setNama("Andi");
        System.out.println("\nSetelah nama diubah:");
        System.out.println(pekerja1);

        // Percobaan akses langsung atribut
//         System.out.println(pekerja1.nama);   // ERROR (karena private)
         System.out.println(pekerja1.usia);   // BISA (karena protected dan dalam package yang sama)
//         System.out.println(pekerja1.gaji);   // ERROR (karena private)

        // Untuk memastikan, coba akses yang public
        System.out.println("\nAkses langsung atribut public:");
        System.out.println("Pekerjaan: " + pekerja1.pekerjaan);
    }
}

