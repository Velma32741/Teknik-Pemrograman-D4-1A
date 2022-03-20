/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisi;

/**
 *
 * @author FAKHRI
 */

import komposisi.Keluarga.Anak;
import komposisi.Keluarga.Ayah;
import komposisi.Keluarga.Ibu;
import komposisi.Keluarga.Keluarga;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //Deklarasi object Keluarga
        Keluarga kaz1 = new Keluarga("Henken", "Tokyo");
        //Menanmbag keluarga
        Ayah ayah = new Ayah(1090, "Yoi Henken", 30);
        Ibu ibu = new Ibu(1075, "Senko Henken", 1000);
        ArrayList<Anak> anakList = new ArrayList<>();
        anakList.add(new Anak(1, "Kaze", 14, "Pelajar"));
        anakList.add(new Anak(2, "Hon", 12, "Pelajar"));
        anakList.add(new Anak(3, "Yami", 7, "Pelajar"));
        kaz1.addAnggotaKeluarga(ayah, ibu, anakList);
        //Output dengan method keluarga
        kaz1.getDataKeluarga();
    }
}