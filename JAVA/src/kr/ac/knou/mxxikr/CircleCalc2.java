package kr.ac.knou.mxxikr;

class CircleCalc2 { // Ŭ���� �̸��� ������ �̸��� ����
	double r;
	public CircleCalc2(double a) { // ������ ����
		r = a; // ��ȯ�� ������������
	}
	
	public double getArea() {
		return r * r * 3.14;
	}
}
