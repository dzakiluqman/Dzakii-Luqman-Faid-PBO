/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Hewan {
    private String nama;
    private int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method
    void suara() {
        System.out.println("Hewan bersuara");
    }

    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }

    void berlari() {
        System.out.println(nama + " sedang berlari");
    }
}
