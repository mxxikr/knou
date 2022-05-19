package kr.ac.knou.mxxikr;

import java.awt.Point;

public class RectangleTest {
	public static void main(String args[]) {
		Point originOne = new Point(23, 94); // Point 클래스에 x와 y좌표값을 저장하기 위한 멤버 변수 존재
		
		Rectangle rectOne = new Rectangle(originOne, 100, 200); // 매개변수가 3개인 Rectangle 객체 생성
		Rectangle rectTwo = new Rectangle(); // 매개변수가 없는 Rectangle 객체 생성
		Rectangle rectThree = new Rectangle(rectTwo.origin, 200, 300);
		
		System.out.println("rectOne origin: "+ rectOne.origin); // Rectangle(Point p, int w, int h) 생성자 호출
		System.out.println("rectOne width: "+ rectOne.width);
		System.out.println("rectOne height: "+ rectOne.height + "\n");

		System.out.println("rectTwo origin: "+ rectTwo.origin + "\n"); // Rectangle() 생성자 호출

		System.out.println("rectThree origin: "+ rectThree.origin); // Rectangle(Point p, int w, int h) 생성자 호출
		System.out.println("rectThree width: "+ rectThree.width); 
		System.out.println("rectThree height: "+ rectThree.height);
	}
}