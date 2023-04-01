/*
 * File : ExceptionOnArray.java  (01/04/2023)
 * Penulis : Devin Januar Siahaan (24060121140158)
* Deskripsi : Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}