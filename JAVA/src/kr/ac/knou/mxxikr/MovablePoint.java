package kr.ac.knou.mxxikr;

class MovablePoint implements Movable { // Movable �������̽� ��� �޾� Ŭ���� ����
	private int x, y; // ������ �ʵ�

	public MovablePoint(int x, int y) { // �����ڿ��� x, y ��ǥ �ʱ�ȭ
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point at (" + x + "," + y + ")";
	}

// Movable �������̽��� �߻� �޼ҵ� ��ü ����
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