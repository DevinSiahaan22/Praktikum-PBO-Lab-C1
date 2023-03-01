class MOperasiTitik {
	public static void main(String[] args) {
		Titik t1;
		t1 = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		System.out.println("Titik : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		o.refleksiSumbuX(t1);
		System.out.println("Titik : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		o.refleksiSumbuY(t1);
		System.out.println("Titik : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
	}
}