package kr.ac.knou.mxxikr;

import java.util.ArrayList;
import java.util.List;

class ArrayListTest {
	public static void main(String args[]) {
		List list1 = new ArrayList(); // Object ����
		
		list1.add("hello"); // hello ���ڿ��� object �������� ����ȯ �Ǿ� �߰�
		System.out.println(list1);
		
		String s1 = (String) list1.get(0); // object �������� ��ȯ �Ǿ� ���� ����ȯ(�ٿ�ĳ����) �ʿ�
		System.out.println(s1);

		List<String> list2 = new ArrayList<String>(); // Ÿ�� ���
		
		list2.add("hello");
		System.out.println(list2);
		
		String s2 = list2.get(0); // ����ȯ�� �ʿ� ����
		System.out.println(s2);
	}
}
