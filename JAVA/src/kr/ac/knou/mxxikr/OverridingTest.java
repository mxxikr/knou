package kr.ac.knou.mxxikr;

class Shape { // �θ� Ŭ����
	public double getArea(double h, double w) { return h * w; }
}

class Triangle extends Shape { // �ڽ� Ŭ����
	public double getArea(double h, double w) { return h * w * 0.5; }
} // getArea �޼ҵ� ������ -> �޼ҵ� �������̵�

public class OverridingTest {
	public static void main(String args[]) {
		Triangle t = new Triangle(); // Shape �ڽ� Ŭ���� Triangle ��ü ����
		System.out.println(t.getArea(3.0, 4.0)); // 3.0 * 4.0 * 0.5 = 6.0 ���
	}
}
