/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author usER
 */
public class MainOverriding {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();              // Output: Meow

        Kucing kucing = new Kucing();
        kucing.makan("ikan");          // Memanggil metode makan() induk
        kucing.makan("ikan", 2);       // Memanggil metode makan() overloaded

        Anjing anjing = new Anjing();
        anjing.bersuara();             // Output: Woof
        anjing.makan("daging", 3);     // Memanggil metode makan() overloaded
    }
}
