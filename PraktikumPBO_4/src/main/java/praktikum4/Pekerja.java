/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Pekerja extends Manusia {
    private double gaji;   // hanya bisa diakses lewat getter & setter

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter & Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString() untuk menampilkan info pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() +
               ", Usia: " + usia +
               ", Pekerjaan: " + pekerjaan +
               ", Gaji: Rp" + gaji;
    }
}

