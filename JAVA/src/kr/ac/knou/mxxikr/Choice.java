package kr.ac.knou.mxxikr;

public class Choice {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;

		int n = 20;

		// if-else��
		if (a == 1)
			if (b == 2)
				System.out.println("a was 1 and b was 2.");
			else // if (b == 2)�� ¦������ else��
				System.out.println("a wasn't 1.");

		// switch��
		switch (n) {
		case 10:
			System.out.println("10�Դϴ�.");
			break;
		case 20:
		case 30:
			System.out.println("20�̰ų� 30�Դϴ�.");
			break;
		default:
			System.out.println("�𸣰ڽ��ϴ�.");
			break;
		}
	}
}
