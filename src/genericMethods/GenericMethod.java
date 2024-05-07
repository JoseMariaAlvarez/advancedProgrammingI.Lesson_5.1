package genericMethods;

import severalParamenters.PairAB;

public class GenericMethod {
		static public <A, B> String toString(PairAB<A, B> pair) {
			return "(" + pair.first() + "," + pair.second() + ")";
		}
		
		public static void main(String args[]) {
			PairAB<String, Integer> p = new PairAB<>("hello", 10);

			System.out.println(GenericMethod.toString(p));

		}
}

