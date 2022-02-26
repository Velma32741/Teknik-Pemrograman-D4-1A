/*
*Class ini adalah mainnya dan mendefinisikan objek serta menunjukkan objek yang memiliki
*telah dibuat. Kelas ini juga menambahkan stok baru ke objek sebelumnya.
 */
package com.mycompany.kasus1;

/**
 *
 * @author Hanri
 */
public class Inventori {
        Barang[] barangs;
	
	void initBarang() {
            barangs = new Barang[2];  /*membuat 2 array baru dari barang*/
            barangs[0] = new Barang("001", "Baju", 10); /*Barang pertama*/ 
            barangs[1] = new Barang("002", "Celana", 20); /*Barang kedua*/ 
            }
	
	void showBarang() {
            /**
            *menampilkan nama dari barang dengan kuantitas stok baru setelah menambahkan
            *dengan stok baru di setStocks.
            */
            System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
            System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
            }
	
	void pengadaan() {
            initBarang();
            /*menambah stocks*/
            barangs[0].setStok(10); /* menambah 10 stock*/
            barangs[0].setStok(20); /* menambah 20 stock*/
            barangs[0].setStok(25); /* menambah 25 stock*/ 	
            showBarang(); /* menampilkan nomor dan nama setelah menambahkan stock baru*/
            }
	
	public static void main(String[] args) {
            Inventori beli = new Inventori(); /*memanggil class inventory*/
            beli.pengadaan(); /*memanggil void pengadaan dan menambahkan stock*/
            }
}