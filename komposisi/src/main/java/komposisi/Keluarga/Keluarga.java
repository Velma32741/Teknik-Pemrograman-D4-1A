/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komposisi.Keluarga;

/**
 *
 * @author FAKHRI
 */
import java.util.ArrayList;

public class Keluarga {

    private ArrayList<Anak> anakList = new ArrayList<Anak>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> anaks){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anaks;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public ArrayList<Anak> getAnakList() {
        return anakList;
    }

    public void getDataKeluarga(){
        System.out.println("Nama Keluarga\t: " + getNamaKeluarga());
        System.out.println("Kota Asal\t\t: " + getKotaAsal());
        System.out.println("Nama Ayah\t\t: " + getAyah().getNamaAyah());
        System.out.println("Nama Ibu\t\t: " + getIbu().getNamaIbu());
        System.out.println("Nama Anak\t: ");
        for(Anak naks : getAnakList()){
            System.out.println("\t - Nama\t: " + naks.getNamaAnak());
            System.out.println("\t   Umur\t: " + naks.getUmurAnak());
            System.out.println("\t   Status\t: " + naks.getStatusAnak());
        }
    }

}