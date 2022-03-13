package com.mycompany.restaurant;

/**
 *
 * @author Hanri
 */
public class Restaurant {
    private Makanan[] Makanan;
    
    private static byte id=0;       

    public Restaurant() { //Menginisialisasi Data Asli
        Makanan = new Makanan[10];
        for(int i = 0; i<10; i++){
            Makanan[i] = new Makanan("dummy", 0.0, 0);
        }
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        Makanan[id].setNama_makanan(nama);
        Makanan[id].setHarga_makanan(harga);
        Makanan[id].setStok(stok);
    }
 
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(Makanan[i].getNama_makanan() +"["+Makanan[i].getStok()+"]"+"\tRp. "+Makanan[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(Makanan[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void kurangStok(int id, int pengurangan){ //Metode Utk Membuat Pengurangan Stok
        Makanan[id].setStok(Makanan[id].getStok() - pengurangan);
    }
    public static void nextId(){        
        id++;
    }    
}