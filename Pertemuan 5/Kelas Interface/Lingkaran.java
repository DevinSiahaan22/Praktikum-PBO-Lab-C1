/*
 * File : Lingkaran.java  (01/04/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
 * Deskripsi : Kelas Implementasi IArea berupa cara menghitung luas lingkaran
 */

//Mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}