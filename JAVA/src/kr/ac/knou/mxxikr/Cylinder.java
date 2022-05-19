package kr.ac.knou.mxxikr;

class Cylinder {
	private CircleCalc c; // 원 (Circle 클래스 변수 정의)
	private int h; // 높이
	
	public Cylinder(CircleCalc a, int b) { // 인자 두개인 생성자
		c = a;
		h = b;
	}
	
	public double getVolume() { // 원통 넓이 구하는 메소드
		return c.getArea() * h;
	}
}
