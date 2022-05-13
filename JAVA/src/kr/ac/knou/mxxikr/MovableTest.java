package kr.ac.knou.mxxikr;

interface Movable {
	void moveUp(); // public �߻� �޼ҵ�
	void moveDown();
	void moveLeft();
	void moveRight();
}

public class MovableTest {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 5); // MovablePoint Ŭ������ ��ü ����
		
		System.out.println(m1); // m1.toString �ڵ� ȣ��
		
		m1.moveUp(); // y ��ǥ ����
		System.out.println(m1);
		
		m1.moveRight(); // x ��ǥ ����
		System.out.println(m1);
	}
}
// ��� ���
// Point at (5, 5)
// Point at (5, 6)
// Point at (6, 6)