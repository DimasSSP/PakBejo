/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakBejo;

/**
 *
 * @author LENOVO
 */
public class Keramik {
    /*Atribut*/
    int ukuran;
    int harga;
    int isi;
    int luas = 100;
    double m2 = 10000;
    
    /*methods*/
    void hargaTotal(){
        int hargaTotal;
        int box;
        float meter2;
        box        = this.ukuran * this.isi;
        meter2     =   (float) (box / this.m2) ;
        hargaTotal = (int) Math.ceil (100 / meter2) * this.harga ;
        System.out.println("Harga Total : Rp." + hargaTotal );
        
    }
}
