package kr.ac.knou.mxxikr;

public class AnonymousTest {
	public static void main(String args[]) {
		AnonymousSuper sub = new AnonymousSuper() { // AnonymousSuper�� ��� �޴� �͸� Ŭ���� ���� �� ��ü ����

			public int a = 20;

			public void method1() {
				System.out.println("sub1");
			}

			public void method3() {
				System.out.println("sub3");
			}
		};

		sub.method1(); // AnonymousSuper�� ��� �޴� ���� Ŭ������ ��ü�� ����Ŵ
		sub.method2(); // AnonymousSuper�� ��� �޴� ���� Ŭ������ ��ü�� method2�� ���� �θ� Ŭ�������� ȣ��
		System.out.println(sub.a); // sub�� ���� ������ AnonymousSuper���� ������ �ʵ� ȣ��
	}
}