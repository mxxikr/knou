package kr.ac.knou.mxxikr;

interface Movable {
	void moveUp(); // public 추상 메소드

	void moveDown();

	void moveLeft();

	void moveRight();
}

public class MovableTest {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 5); // MovablePoint 클래스의 객체 생성

		System.out.println(m1); // m1.toString 자동 호출

		m1.moveUp(); // y 좌표 증가
		System.out.println(m1);

		m1.moveRight(); // x 좌표 증가
		System.out.println(m1);
	}
}
// 출력 결과
// Point at (5, 5)
// Point at (5, 6)
// Point at (6, 6)