/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author usER
 */
import java.util.ArrayList;
import java.util.List;

class PerpustakaanExercise {
    private List<BukuExericse> bukuList;

    public PerpustakaanExercise() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(BukuExericse buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (BukuExericse buku : bukuList) {
            buku.infoBuku();
        }
    }
}
