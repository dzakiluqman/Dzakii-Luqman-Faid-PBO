/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author usER
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.jenis = "Persia";
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.jenis = "Bulldog";
        anjing.tampilkanInfo();
    }
}