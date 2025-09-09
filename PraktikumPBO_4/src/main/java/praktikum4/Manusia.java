/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Manusia {
    private String nama;       // hanya bisa diakses lewat getter & setter
    protected int usia;        // bisa diakses di package yang sama & subclass
    public String pekerjaan;   // bisa diakses dari mana saja

    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter & Setter untuk nama (private)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

