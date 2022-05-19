package kr.ac.knou.mxxikr;

class CircleThis {
	static double PI = 3.14; // 정적 변수, 클래스 변수
	double radius = 2;

	public double getArea() { 
		return this.radius * this.radius * PI; // c1.radius 호출 시 this값은 c1값을 가지게 됨
	}
	public void display() {
		System.out.println("반지름:" + this.radius + " 면적:" + this.getArea()+ " this:" +this);
	}
	
	public static void main(String args[]) {
		CircleThis c1 = new CircleThis();
		CircleThis c2 = new CircleThis();
		c1.display(); // 반지름:2.0 면적:12.56 this:kr.ac.knou.mxxikr.CircleThis@76ccd017
		c2.display(); // 반지름:2.0 면적:12.56 this:kr.ac.knou.mxxikr.CircleThis@182decdb
	}
}