package constraints;

import motivation.Pair;

public class NumericPair<T extends Number> extends Pair<T> {

	public NumericPair(T f, T s) {
		super(f, s);
		
	}

	public static void main(String[] args) {
		NumericPair<Integer>  p  = new NumericPair<Integer>(10, 15);
		NumericPair<String> q  = new NumericPair<String>("hello", "bye");

	}

}
