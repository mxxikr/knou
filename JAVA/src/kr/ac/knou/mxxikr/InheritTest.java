package kr.ac.knou.mxxikr;

public class InheritTest {
	public static void main(String args[]) {
		CSub sub = new CSub();
//		sub.f1 = 40; // 부모 클래스 CSuper의 private 변수 f1을 호출해 오류 발생
		sub.f2 = 50;
//		sub.f3 = 60; // CSub 클래스의 private 변수 f3을 호출해 오류 발생
		sub.f4 = 70;
		sub.setPrivate();
		sub.setPublic();
//		sub.mPrivate(); // 부모 클래스 CSuper의 private 메소드 호출해 오류 발생
	}
}
