package kr.ac.knou.mxxikr;

public class InheritTest {
	public static void main(String args[]) {
		CSub sub = new CSub();
//		sub.f1 = 40; // �θ� Ŭ���� CSuper�� private ���� f1�� ȣ���� ���� �߻�
		sub.f2 = 50;
//		sub.f3 = 60; // CSub Ŭ������ private ���� f3�� ȣ���� ���� �߻�
		sub.f4 = 70;
		sub.setPrivate();
		sub.setPublic();
//		sub.mPrivate(); // �θ� Ŭ���� CSuper�� private �޼ҵ� ȣ���� ���� �߻�
	}
}
