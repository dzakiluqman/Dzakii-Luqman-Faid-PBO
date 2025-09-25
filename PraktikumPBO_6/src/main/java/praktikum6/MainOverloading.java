/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author usER
 */
public class MainOverloading {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();

        kucing.bersuara();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);  
    }
}
