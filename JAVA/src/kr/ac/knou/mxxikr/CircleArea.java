package kr.ac.knou.mxxikr;

public class CircleArea {

	public static void main(String[] args) {
		CircleCalc c = new CircleCalc(5); // CircleArea2�� Circle Ŭ������ ���� ��Ű�� �ȿ� ���� ��� ��� ����
//		System.out.println(c.r); // private ������ �ʵ�� ������ ���� �߻�
		System.out.println(c.getRadius());  // r �� ���ϰ����� ������ �ִ� getRadius �޼ҵ� ȣ���� ���
		System.out.println(c.getArea( ));
	}

}
