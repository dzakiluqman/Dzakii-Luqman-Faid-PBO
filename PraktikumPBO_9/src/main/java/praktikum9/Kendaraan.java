/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author usER
 */
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();

    // Metode konkrit
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}
