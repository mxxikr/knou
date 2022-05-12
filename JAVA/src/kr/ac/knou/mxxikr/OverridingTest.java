package kr.ac.knou.mxxikr;

class Shape { // 부모 클래스
	public double getArea(double h, double w) { return h * w; }
}

class Triangle extends Shape { // 자식 클래스
	public double getArea(double h, double w) { return h * w * 0.5; }
} // getArea 메소드 재정의 -> 메소드 오버라이딩

public class OverridingTest {
	public static void main(String args[]) {
		Triangle t = new Triangle(); // Shape 자식 클래스 Triangle 객체 생성
		System.out.println(t.getArea(3.0, 4.0)); // 3.0 * 4.0 * 0.5 = 6.0 출력
	}
}
