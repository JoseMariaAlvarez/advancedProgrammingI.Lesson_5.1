package motivation;

public class Pair <T>   {
	private T first, second;
	public Pair(T f, T s) {	first = f; second = s; }
	
	public T first() { return first; }
	public T second() { return second; }

	public void first(T f) { first = f; }
	public void second(T s) { second = s;}

	public static void main(String[] args) {
		Pair<String> pairS = new Pair<String>("hello", "bye");
		Pair<Integer> pairI = new Pair<Integer>(4, 9);
		Pair<Integer> pairN = new Pair<>(4, 9);  // type inference
	}

}