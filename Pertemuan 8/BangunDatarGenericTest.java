/**
 * File : BangunDatarGenericTest.java 
 * Penulis : Devin Januar Siahaan - 24060121140158
 * Deskripsi : main class untuk generic bangun datar
 */

 public class BangunDatarGenericTest{
  public static void main(String[] args){
    Lingkaran l = new Lingkaran(2);
    BangunDatarGeneric<Lingkaran> bdgL = new BangunDatarGeneric<Lingkaran>();
    bdgL.set(l);
    System.out.println("keliling lingkaran : "+bdgL.hitungKeliling());
    System.out.println("tipe generic : "+bdgL.get().getClass().getName());

  }
}