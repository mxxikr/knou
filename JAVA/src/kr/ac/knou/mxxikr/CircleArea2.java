package kr.ac.knou.mxxikr;

public class CircleArea2 {
	public static void main(String args[]) {
		CircleCalc2 c1 = new CircleCalc2(5.0); // ������ ȣ��
		CircleCalc2 c2 = new CircleCalc2(4.0); // ������ ȣ��
		
		System.out.println(c1.r); // r�� ���������ڰ� ���������ʾ� ���� ��Ű���� �ٸ� Ŭ�������� ��� ����
		System.out.println(c1.getArea());
		System.out.println(c1.count);
		
		c2.r = 6; // c�� r�� ����, ��ü ���
		System.out.println(c2.r);
		System.out.println(c2.getArea()); // c���� getArea() ������ ��û
		System.out.println(c2.count);
	}

}
