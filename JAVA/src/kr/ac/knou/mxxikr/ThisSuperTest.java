package kr.ac.knou.mxxikr;

public class ThisSuperTest {
	public static void main(String args[]) {
		CSub2 sub2 = new CSub2(10.0);
		System.out.println(sub2.x); // CSub2 클래스의 데이터 필드 10 출력
	
		System.out.println(sub2.getSuper()); // CSuper2 클래스의 데이터 필드 100 출력
 
		System.out.println(sub2.getSub()); // CSub2 클래스에서 재정의 한 10 출력
	}
}
