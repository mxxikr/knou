package kr.ac.knou.mxxikr;

class CircleThis {
	static double PI = 3.14; // ���� ����, Ŭ���� ����
	double radius = 2;

	public double getArea() { 
		return this.radius * this.radius * PI; // c1.radius ȣ�� �� this���� c1���� ������ ��
	}
	public void display() {
		System.out.println("������:" + this.radius + " ����:" + this.getArea()+ " this:" +this);
	}
	
	public static void main(String args[]) {
		CircleThis c1 = new CircleThis();
		CircleThis c2 = new CircleThis();
		c1.display(); // ������:2.0 ����:12.56 this:kr.ac.knou.mxxikr.CircleThis@76ccd017
		c2.display(); // ������:2.0 ����:12.56 this:kr.ac.knou.mxxikr.CircleThis@182decdb
	}
}