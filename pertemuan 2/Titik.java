class Titik {
	double absis;
	double ordinat;
	static int counterTitik;  //Menghitung Objek Titik
	Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	Titik() {
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	void setAbsis(double a) {
		absis = a;
	}
	void setOrdinat(double o) {
		ordinat = o;
	}
	double getAbsis() {
		return absis;
	}
	double getOrdinat() {
		return ordinat;
	}
	int getCounterTitik() {
		return counterTitik;
	}
}