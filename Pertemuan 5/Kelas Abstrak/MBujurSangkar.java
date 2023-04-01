/*
 * File : MBujurSangkar.java  (01/04/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
 * Deskripsi : kelas yang mengimplementasi cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}