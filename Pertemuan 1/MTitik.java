class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		t2 = new Titik(9,3);
		
		System.out.println("Absis dari t1 adalah "+ t1.getAbsis());
		System.out.println("Ordinat dari t1 adalah "+ t1.getOrdinat());
		System.out.println("Jumlah objek titik adalah "+ t1.getCounterTitik());
		
		System.out.println("Absis dari t2 adalah "+ t2.getAbsis());
		System.out.println("Ordinat dari t2 adalah "+ t2.getOrdinat());
		System.out.println("Jumlah objek titik adalah "+ t2.getCounterTitik());
	}
}