/*
*Class ini digunakan untuk mendefinisikan struktur data yang akan digunakan oleh objek tersebut.
 */
package com.mycompany.kasus1;

/**
 *
 * @author Hanri
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    /**
    *stok akan dienkapsulasi dengan menggunakan
    *variabel privat untuk melarang penggunaan
    *operasi matematika lain selain tambah 
    */
    private int stok;
    
    public int getStok() {
	return stok; /* Untuk mendapatkan stok setelah menambahkan kuantitas*/
	}
    
    public void setStok(int stok) {
	this.stok += stok; /* atur stok dengan menambahkan kuantitas*/
	}

    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }
} 