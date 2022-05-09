package kr.ac.knou.mxxikr;

class CircleCalc {
	private double r; // ������ �ʵ� ���� �ÿ� ���������� ��� ����
	// r �� Circle Ŭ���� �ȿ����� ��� ����
	public CircleCalc(double a) { // �޼ҵ� ���� �ÿ� ���������� ��� ����
		r = a;
	}

	public double getArea() {
		return r * r * 3.14;
	}

	public double getRadius() {
		return r;
	}
}
