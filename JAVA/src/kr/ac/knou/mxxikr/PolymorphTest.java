package kr.ac.knou.mxxikr;

public class PolymorphTest {
	public static void main(String args[]) {
		A a = new B();
		a.func(); // B Ŭ������ func �޼ҵ� ȣ��
		a = new C();
		a.func(); // C Ŭ������ func �޼ҵ� ȣ��
	}
}
// ��� ���
// b
// c