package kr.ac.knou.mxxikr;

class CircleCalc2 { // 클래스 이름과 생성자 이름이 같음
	static int count;
	double r;
	
	public CircleCalc2(double a) { // 생성자 정의
		r = a; // 반환형 존재하지않음
	}
	
	public double getArea() {
//		return r * r * 3.14;
		return this.r * this.r * 3.14;
	}
}
