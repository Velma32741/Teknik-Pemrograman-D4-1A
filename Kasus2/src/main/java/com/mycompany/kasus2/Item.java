/*
*Class ini berisi metode untuk mencetak nama item yang akan digunakan pada kelas UpinIpin.
*/
package com.mycompany.kasus2;

/**
 *
 * @author Hanri
 */
public class Item {
    /**
     * *Kedua variabel diatur sebagai private untuk mengenkapsulasi variabel.
     */
    private String name;
    
    /**
     *Atur nilai neame sebagai Ipin dengan
     *konstruktor Item() yang ditetapkan sebagai
     *sebuah variabel lokal.
     */
    private Item() {
    name = "Ipin";
    }
    public Item(String name) { 
    this();
    System.out.println(this.name);
    }
}