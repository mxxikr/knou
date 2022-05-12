package kr.ac.knou.mxxikr;

class Cylinder {
	private CircleCalc c; // �� (Circle Ŭ���� ���� ����)
	private int h; // ����
	
	public Cylinder(CircleCalc a, int b) { // ���� �ΰ��� ������
		c = a;
		h = b;
	}
	
	public double getVolume() { // ���� ���� ���ϴ� �޼ҵ�
		return c.getArea() * h;
	}
}
