package kr.ac.knou.mxxikr;

public class Cylinder2 extends CircleCalc {
	private double height;

	public Cylinder2() {
		super(); // �θ�Ŭ������ ������ �ʱ�ȭ r = 3
		height = 1.0;
	}

	public Cylinder2(double radius, double h) {
		super(radius); // double���� ������ ���ڷ� �θ�Ŭ������ ������ �ʱ�ȭ
		this.height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		this.height = h;
	}

	public double getArea() { // Cylinder�� getArea() �޼ҵ�
		return 2 * 3.14 * getRadius() * height + 2 * super.getArea(); // ��ӹ��� Ŭ������ getArea() ȣ��
	}

	public double getVolume() {
		return super.getArea() * height; // Circle�� getArea() �޼ҵ� ȣ��
	}

	public String toString() {
		return "Cylinder of radius = " + getRadius() + " height = " + height;
	}

	public static void main(String[] args) {
		Cylinder2 c2 = new Cylinder2();
		Cylinder2 c22 = new Cylinder2(2, 5);

		System.out.println(c2.getHeight()); // 1.0
		c2.setHeight(8);
		System.out.println(c2.getHeight()); // 8.0
		System.out.println(c2.getArea()); // 2 * 3.14 * 3 * 8.0 + 2 * 3 * 3 * 3.14
		System.out.println(c2.getVolume()); // 3 * 3 * 3.14 * 8.0
		System.out.println(c2.toString());

		System.out.println(c22.getHeight()); // 5
		c22.setHeight(10);
		System.out.println(c22.getHeight()); // 10
		System.out.println(c22.getRadius()); // 2.0
		System.out.println(c22.getArea()); // 2 * 3.14 * 2 * 10 + 2 * 2 * 2 * 3.14
		System.out.println(c22.getVolume()); // 2 * 2 * 3.14 * 10
		System.out.println(c22.toString());
	}
}