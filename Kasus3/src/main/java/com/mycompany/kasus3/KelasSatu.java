/*
 * Class ini akan mencetak nomor dari Classnya sendiri
 * dan akan dipanggil oleh Class main sebagai tipe baru
 */
package com.mycompany.kasus3;

/**
 *
 * @author Hanri
 */
public class KelasSatu {
    {
        /**
        *akan diprint setiap kali setelah satu
        *nomor dari Class KelasSatu terprint
        *agar bertindak sebagai inisialisasi block
        *statis
        */
        System.out.println(11); 
    }
    
    static
    {
        System.out.println(2); /*print kedua*/
    }
        
    public KelasSatu(int i)
    {
        System.out.println(3); /*print ketiga*/
    }
    
    public KelasSatu()
    {
        /**
         * print keempat terakhir dan tidak mempunyai parameter
         */
        System.out.println(4);
    }
}   