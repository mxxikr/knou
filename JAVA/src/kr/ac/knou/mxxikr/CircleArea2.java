package kr.ac.knou.mxxikr;

public class CircleArea2 {
	public static void main(String args[]) {
		CircleCalc2 c = new CircleCalc2(5.0); // ������ ȣ��
		
		System.out.println(c.r); // r�� ���������ڰ� ���������ʾ� ���� ��Ű���� �ٸ� Ŭ�������� ��� ����
		System.out.println(c.getArea());
		
		c.r = 5; // c�� r�� ����, ��ü ���
		System.out.println(c.r);
		System.out.println(c.getArea()); // c���� getArea() ������ ��û
	}

}
