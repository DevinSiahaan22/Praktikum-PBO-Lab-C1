/**
* File : MKubus.java 15/03/2023
* Penulis : Devin Januar Siahaan
* Deskripsi : driver class untuk Kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 4 Pemrograman Berorientasi Objek C1");
		System.out.println("Devin Januar Siahaan");
		System.out.println("24060121140158");
		System.out.println("============================================================");
		
		System.out.println("-----Kubus-----");
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Permukaan Kubus dengan Panjang Sisi 4 Satuan : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan Panjang Sisi 4 Satuan : "+kubus.hitungVolume());
		
		System.out.println("============================================================");
	}
}
	