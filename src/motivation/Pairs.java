package motivation;

class PairInt {
	private int first, second;
	public PairInt(int f, int s) { first = f; second = s; }

	public int first() { return first; }
	public int second() { return second; }

	public void first(int f) { first = f; }
	public void second(int s) { second = s; }
}

class PairString {
	private String first, second;
	public PairString(String f, String s) {	first = f; second = s;}
	public String first() { return first; }
	public String second() { return second; }

	public void first(String f) { first = f; }
	public void second(String s) { second = s;}
}

public class Pairs {

	public static void main(String[] args) {

		PairInt pI = new PairInt(10, 20);
		PairString pS = new PairString("hello", "bye");

	}

}
