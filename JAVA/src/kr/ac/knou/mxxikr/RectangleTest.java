package kr.ac.knou.mxxikr;

import java.awt.Point;

public class RectangleTest {
	public static void main(String args[]) {
		Point originOne = new Point(23, 94); // Point Ŭ������ x�� y��ǥ���� �����ϱ� ���� ��� ���� ����
		
		Rectangle rectOne = new Rectangle(originOne, 100, 200); // �Ű������� 3���� Rectangle ��ü ����
		Rectangle rectTwo = new Rectangle(); // �Ű������� ���� Rectangle ��ü ����
		Rectangle rectThree = new Rectangle(rectTwo.origin, 200, 300);
		
		System.out.println("rectOne origin: "+ rectOne.origin); // Rectangle(Point p, int w, int h) ������ ȣ��
		System.out.println("rectOne width: "+ rectOne.width);
		System.out.println("rectOne height: "+ rectOne.height + "\n");

		System.out.println("rectTwo origin: "+ rectTwo.origin + "\n"); // Rectangle() ������ ȣ��

		System.out.println("rectThree origin: "+ rectThree.origin); // Rectangle(Point p, int w, int h) ������ ȣ��
		System.out.println("rectThree width: "+ rectThree.width); 
		System.out.println("rectThree height: "+ rectThree.height);
	}
}