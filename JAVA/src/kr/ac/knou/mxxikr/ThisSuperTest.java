package kr.ac.knou.mxxikr;

public class ThisSuperTest {
	public static void main(String args[]) {
		CSub2 sub2 = new CSub2(10.0);
		System.out.println(sub2.x); // CSub2 Ŭ������ ������ �ʵ� 10 ���
	
		System.out.println(sub2.getSuper()); // CSuper2 Ŭ������ ������ �ʵ� 100 ���
 
		System.out.println(sub2.getSub()); // CSub2 Ŭ�������� ������ �� 10 ���
	}
}
