/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author usER
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha RX-King";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-Tak";
        motor.tampilkanInfo();
    }
}
