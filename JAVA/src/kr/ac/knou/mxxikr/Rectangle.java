package kr.ac.knou.mxxikr;

import java.awt.Point;

class Rectangle {
	public int width = 0; // non-static ���� �ʱ�ȭ
	public int height = 0;
	public Point origin; // Point Ŭ���� : ��ǥ���� � ��ġ�� ��Ÿ���µ� ����ϴ� Ŭ����

	public Rectangle() {
		origin = new Point(0,0);
	}

	public Rectangle(Point p, int w, int h) { // �����ڸ� ����� ������ �ʵ� �ʱ�ȭ
		origin = p;
		width = w;
		height = h;
	}
}