package kr.ac.knou.mxxikr;

public class MultipleType {
	public static void main(String args[]) {
		Pair<String, Integer> p1;
		p1 = new OrderedPair<>("Even", 8); // new OrderedPair <String, Integer>

		Pair<String, String> p2;
		p2 = new OrderedPair<>("hello", "java");

		System.out.println("p1 key : " + p1.getKey() + "\np1 value : " + p1.getValue());
		System.out.println("p2 key : " + p2.getKey() + "\np2 value : " + p2.getValue());
	}
}