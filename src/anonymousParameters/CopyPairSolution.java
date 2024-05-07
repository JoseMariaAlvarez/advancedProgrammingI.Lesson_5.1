package anonymousParameters;

import motivation.Pair;

public class CopyPairSolution {

	static public <T> void copyFirst(Pair<T> src, Pair<? super T> dest) {
//		static public <T> void copyFirst(Pair<? extends T> src, Pair<? super T> dest) {
		dest.first(src.first());
	}

	public static void main(String [] args) {
		ImportedCar ip = new ImportedCar("Porche", 50000, 3000);
		ImportedCar is = new ImportedCar("Mazda", 40000, 2500);
		Pair<ImportedCar> pairI = new Pair<ImportedCar>(ip, is);
		Car cp = new Car("Seat", 14000);
		Car cs = new Car("Renault", 18000);
		Pair<Car> pairC = new Pair<Car>(cp, cs);
		CopyPairSolution.copyFirst(pairI, pairC);
	}

}
