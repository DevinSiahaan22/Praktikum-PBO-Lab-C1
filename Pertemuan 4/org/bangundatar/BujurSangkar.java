/**
* File : BujurSangkar.java 15/03/2023
* Penulis : Devin Januar Siahaan
* Deskripsi : driver class untuk Bujur Sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangsisi){
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}

}