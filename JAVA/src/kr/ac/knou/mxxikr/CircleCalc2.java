package kr.ac.knou.mxxikr;

class CircleCalc2 { // Ŭ���� �̸��� ������ �̸��� ����
	static int count;
	double r;
	
	public CircleCalc2(double a) { // ������ ����
		r = a; // ��ȯ�� ������������
	}
	
	public double getArea() {
//		return r * r * 3.14;
		return this.r * this.r * 3.14;
	}
}
