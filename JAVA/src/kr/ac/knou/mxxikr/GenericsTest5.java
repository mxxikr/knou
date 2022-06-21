package kr.ac.knou.mxxikr;

class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
	}
}

public class GenericsTest5 {
	public static void main(String args[]) {
		Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
		Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");

		boolean same = Util.<Integer, String>compare(p1, p2); // <Integer, String> 생략 가능

		System.out.println(same);
	}
}
