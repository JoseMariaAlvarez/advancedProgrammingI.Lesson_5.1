package severalParameters;

public class PairAB <A, B> {
		private A first;
		private B second;
	
		public PairAB(A a, B b) { first = a; second = b; }

		public A first() { return first ; }
		
		public B second() { return second; }

		public void first(A a) { first = a; }
	
		public void second(B b) { second = b; }

	public static void main(String[] args) {
		PairAB<String, Integer> p = 
				new PairAB<String, Integer>("hello", 10);


	}

}
