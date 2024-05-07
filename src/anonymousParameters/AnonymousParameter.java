package anonymousParameters;

import severalParamenters.PairAB;

public class AnonymousParameter {
	public static String toString(PairAB<?,?> pair) {
		return "(" + pair.first() + "," + pair.second() + ")";
	}

//	public static <A,B> String toString(PairAB<A,B> pair) {
//		return "(" + pair.first() + "," + pair.second() + ")";
//	}

}

