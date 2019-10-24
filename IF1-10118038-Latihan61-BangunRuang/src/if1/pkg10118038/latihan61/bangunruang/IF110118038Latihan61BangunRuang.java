/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan61.bangunruang;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Volume Bangun Ruang

 */
public abstract class IF110118038Latihan61BangunRuang {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====BOLA=====");
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah " + bola.getR() + " cm");
        System.out.printf("Hasil : V = %.1f cm³\n" ,bola.hitungVolume());
        
        System.out.println("\n=====TABUNG=====");
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Sebuah tabung memiliki jari-jari berukuran " + tabung.getR() + " cm. Jika tingginya " + tabung.getT() + " cm,");
        System.out.printf("Hasil V = %.1f cm³\n" ,tabung.hitungVolume());
        
        System.out.println("\n=====KERUCUT=====");
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Diketahui tinggi sebuah kerucut " + kerucut.getT() + " cm. Jika jari-jarinya " + kerucut.getR() + " cm,");
        System.out.printf("Hasil : V = %.1f cm³" ,kerucut.hitungVolume());
        
        
    }
    
}
