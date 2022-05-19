package kr.ac.knou.mxxikr;

public class CircleArea2 {
	public static void main(String args[]) {
		CircleCalc2 c1 = new CircleCalc2(5.0); // 생성자 호출
		CircleCalc2 c2 = new CircleCalc2(4.0); // 생성자 호출
		
		System.out.println(c1.r); // r에 접근제어자가 존재하지않아 같은 패키지의 다른 클래스에서 사용 가능
		System.out.println(c1.getArea());
		System.out.println(c1.count);
		
		c2.r = 6; // c의 r을 변경, 객체 사용
		System.out.println(c2.r);
		System.out.println(c2.getArea()); // c에게 getArea() 실행을 요청
		System.out.println(c2.count);
	}

}
