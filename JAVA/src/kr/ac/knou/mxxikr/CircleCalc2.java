package kr.ac.knou.mxxikr;

class CircleCalc2 { // Ŭ���� �̸��� ������ �̸��� ����
	static int count;
	final static double PI = 3.141592; // ��� ������ ����
	double r;
	
	public CircleCalc2(double a) { // ������ ����
		r = a; // ��ȯ�� ������������
	}
	
	public double getArea() {
//		return r * r * 3.14;
		return this.r * this.r * PI;
	}
}
