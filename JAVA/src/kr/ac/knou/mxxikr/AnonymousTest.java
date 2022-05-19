package kr.ac.knou.mxxikr;

public class AnonymousTest {
	public static void main(String args[]) {
		AnonymousSuper sub = new AnonymousSuper() { // AnonymousSuper를 상속 받는 익명 클래스 정의 후 객체 생성

			public int a = 20;

			public void method1() {
				System.out.println("sub1");
			}

			public void method3() {
				System.out.println("sub3");
			}
		};

		sub.method1(); // AnonymousSuper를 상속 받는 하위 클래스의 객체를 가리킴
		sub.method2(); // AnonymousSuper를 상속 받는 하위 클래스의 객체에 method2가 없어 부모 클래스에서 호출
		System.out.println(sub.a); // sub의 선언 유형인 AnonymousSuper에서 데이터 필드 호출
	}
}