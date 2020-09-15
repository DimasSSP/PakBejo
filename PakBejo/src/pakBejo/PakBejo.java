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
public class PakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik kA = new Keramik();
        kA.harga  = 54000;
        kA.ukuran = 30*30;
        kA.isi    = 10;
        kA.hargaTotal();
        
        Keramik kB = new Keramik ();
        kB.harga  = 65000;
        kB.ukuran = 40*40;
        kB.isi    = 5;
        kB.hargaTotal();
        
        Keramik kC = new Keramik ();
        kC.harga  = 60000;
        kC.ukuran = 30*40;
        kC.isi    = 8;
        kC.hargaTotal();
    }
    
}
