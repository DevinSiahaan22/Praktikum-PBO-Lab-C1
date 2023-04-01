/*
 * File : BujurSangkar.java  (01/04/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
 * Deskripsi : kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

/*Soal
    Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? jelaskan!
*/
/*Penyelesaian
    Akan terjadi error jika implementasi metode dari abstrak tersebut tidak dibuat, dimana file BujurSangkar tidak bisa dikompile dan tidak disebut sebagai inherit abstract dari bangun datar
*/ 