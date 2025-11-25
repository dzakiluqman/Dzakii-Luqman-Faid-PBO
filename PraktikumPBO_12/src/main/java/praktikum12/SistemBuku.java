/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemBuku {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek (Serialisasi)");
            System.out.println("4. Tampilkan dari File Teks");
            System.out.println("5. Tampilkan dari File Serialisasi");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerial();
                case 6 -> {
                    System.out.println("Keluar...");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku ditambahkan!");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data berhasil disimpan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Error menulis file teks.");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek berhasil disimpan ke " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Error serialisasi objek.");
        }
    }

    private static void tampilkanDariFileTeks() {
        System.out.println("\nIsi file teks:");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file teks.");
        }
    }

    private static void tampilkanDariFileSerial() {
        System.out.println("\nIsi file serial:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> list = (List<Buku>) ois.readObject();
            for (Buku buku : list) {
                buku.tampilkanInfo();
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca file serial.");
        }
    }
}

