package kr.ac.knou.mxxikr;

class CSuper2 { // 부모 클래스
	public double x;
}

class CSub2 extends CSuper2 { // 자식 클래스
	public double x;

	public CSub2(double new_x) { // CSub2 생성자
		this.x = new_x; // 자식 클래스의 x 필드 값 지정
		super.x = new_x * 10; // 부모클래스의 x 필드 값 지정
	}
	
	public double getSuper() {
		return super.x; // 상속받은 x 리턴
	}

	public double getSub() {
		return this.x; // 재정의한 x 리턴
	}
}