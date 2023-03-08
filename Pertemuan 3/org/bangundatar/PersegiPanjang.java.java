/**
* File : PersegiPanjang.java 08/03/2023
* Penulis : Devin Januar Siahaan
* Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
*/
package org.bangundatar;

import org.poligon.poligon;

public class PersegiPanjang extends poligon{
	private double panjang,lebar;
	
	public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjang * lebar;
	}
	public void printInfo(){
		System.out.printIn("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
	}
	
}
	