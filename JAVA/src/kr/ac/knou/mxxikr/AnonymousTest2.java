package kr.ac.knou.mxxikr;

public class AnonymousTest2 {
	public static void main(String args[]) {
		MyInterface sub = new MyInterface() {
			
			public void method() {
				System.out.println("sub1");
			}
		};

		sub.method();
	}
}
// 출력 결과
// sub1