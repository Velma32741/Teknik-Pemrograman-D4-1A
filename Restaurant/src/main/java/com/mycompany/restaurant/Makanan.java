package com.mycompany.restaurant;

/**
 *
 * @author Hanri
 */
public class Makanan { //Membuat Class Baru Agar Di class Restaurant Tidak Banyak Data
    private String nama_makanan;   
    private double harga_makanan; // Membuat Class Design No. 1
    private int stok;             // Menjaga Data Menjadi Private

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


   
    
    Makanan(String nama, double harga, int Stok){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = Stok;
    }    
}