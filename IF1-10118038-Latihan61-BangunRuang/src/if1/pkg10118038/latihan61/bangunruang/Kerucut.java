/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan61.bangunruang;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Volume Bangun Ruang
 */
public class Kerucut implements BangunRuang {
    private double r;
    private double t;
    private final double phi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    @Override
    public double hitungVolume() {
        return (1*phi*r*r*t)/3;
    }
    
    
    
    
    
    
}
