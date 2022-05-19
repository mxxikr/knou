package kr.ac.knou.mxxikr;

class Circle {
	protected int radius = 1;
}

class Literal {
	final static int nConst = 3; // 선언시 초기 값 지정
}

public class DataType {

	public static void main(String[] args) {
		Circle c = new Circle();
		float f = (float) 5.5;

		System.out.println(1 + 3);
		System.out.println("a" + "bcd");
		System.out.println(c.radius);
		System.out.println(Literal.nConst);
		System.out.println(f);
		System.out.println("j=" + 10);
	}

}
