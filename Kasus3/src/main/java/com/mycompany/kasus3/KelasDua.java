/*
 * Class ini akan menprint nomor dari Classnya sendiri
 * dan nomor dari Class KelasSatu yang dipanggil oleh menggunakan Construct
 */
package com.mycompany.kasus3;

/**
 *
 * @author Hanri
 */
public class KelasDua {
 {
        /** 
        * Terakhir menprint dan hanya akan dieksekusi jika kelas KelasDua mendapatkan
        * constructed.
        */
        System.out.println(5);
    }
    
    public static void main(String[] args) {
		System.out.println(6); /* menprint pertama*/
		KelasSatu satu = new KelasSatu(); /*construct object tnapa parameter*/
		KelasSatu dua = new KelasSatu(10); /*Construct object dengan parameter*/
                KelasDua tiga = new KelasDua();
	}    
}
