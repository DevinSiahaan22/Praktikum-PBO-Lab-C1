/*
 * File : BangunDatar.java  (01/04/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}