/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPractice {
    public static void main(String[] args) {

        String filePath = "produk.ser";

        // Membuat objek
        Produk produk = new Produk("Laptop", 15000000, 10);

        // Serialisasi
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(produk);
            System.out.println("Objek berhasil disimpan ke file: " + filePath);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
        }

        // Deserialisasi
        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(filePath))) {

            Produk p = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            p.tampilkanInfo();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
        }
    }
}
