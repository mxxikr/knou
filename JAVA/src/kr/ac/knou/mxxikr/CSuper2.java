package kr.ac.knou.mxxikr;

class CSuper2 { // �θ� Ŭ����
	public double x;
}

class CSub2 extends CSuper2 { // �ڽ� Ŭ����
	public double x;

	public CSub2(double new_x) { // CSub2 ������
		this.x = new_x; // �ڽ� Ŭ������ x �ʵ� �� ����
		super.x = new_x * 10; // �θ�Ŭ������ x �ʵ� �� ����
	}
	
	public double getSuper() {
		return super.x; // ��ӹ��� x ����
	}

	public double getSub() {
		return this.x; // �������� x ����
	}
}