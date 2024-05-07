package inheritance;

import motivation.Pair;

public class PairWeight<T> extends Pair<T> {
	int firstWeight;
	int secondWeight;

	public PairWeight(T f, int fw, T s, int sw) {
		super(f, s);
		firstWeight = fw;
		secondWeight = sw;
	}

	public static void main(String args[]) {
		PairWeight<String> pairw = new PairWeight<>("hello", 112, "bye", 65);
	}

}
