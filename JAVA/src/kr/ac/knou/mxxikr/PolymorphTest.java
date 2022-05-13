package kr.ac.knou.mxxikr;

public class PolymorphTest {
	public static void main(String args[]) {
		A a = new B();
		a.func(); // B 클래스의 func 메소드 호출
		a = new C();
		a.func(); // C 클래스의 func 메소드 호출
	}
}
// 출력 결과
// b
// c