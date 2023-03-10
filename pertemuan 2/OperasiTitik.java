/*
 * File : OperasiTitik.java  (01/03/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
 * Deskripsi : suatu kelas yang berisi program operasi Titik
 */

class OperasiTitik{
  private void refleksiSumbuX(Titik titik){
    double ordinat = titik.getOrdinat();
    ordinat = ordinat*(-1);
    titik.setOrdinat(ordinat);
    /*titik.setOrdinat(-titik.getOrdinat);*/
  }
  
  private void refleksiSumbuY(Titik titik){
    double absis = titik.getAbsis();
    absis = absis*(-1);
    titik.setOrdinat(absis);    
    /*titik.setOrdinat(-titik.getOrdinat);*/
  }

  public Titik refleksiX(Titik titik){
    refleksiSumbuX(titik);
    return titik;
  }

  public Titik refleksiY(Titik titik){
    refleksiSumbuY(titik);
    return titik;
  }
}