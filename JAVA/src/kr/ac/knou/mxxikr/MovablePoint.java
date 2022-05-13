package kr.ac.knou.mxxikr;

class MovablePoint implements Movable { // Movable 인터페이스 상속 받아 클래스 생성
	private int x, y; // 데이터 필드

	public MovablePoint(int x, int y) { // 생성자에서 x, y 좌표 초기화
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point at (" + x + "," + y + ")";
	}

// Movable 인터페이스의 추상 메소드 몸체 구현
	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveLeft() {
		x--;
	}

	public void moveRight() {
		x++;
	}
}