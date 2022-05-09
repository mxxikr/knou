package kr.ac.knou.mxxikr;

class CircleCalc {
	private double r; // 데이터 필드 선언 시에 접근제어자 사용 가능
	// r 은 Circle 클래스 안에서만 사용 가능
	public CircleCalc(double a) { // 메소드 선언 시에 접근제어자 사용 가능
		r = a;
	}

	public double getArea() {
		return r * r * 3.14;
	}

	public double getRadius() {
		return r;
	}
}
