public class OperasiTitik{
	public void refleksiSumbuX(Titik T){
		double y;
		y = T.getOrdinat();
		y *= -1;
		T.setOrdinat(y);
	}
	public void refleksiSumbuY(Titik T){
		double X;
		X = T.getAbsis();
		X *= -1;
		T.setOrdinat(X);
	}
}