package kr.ac.knou.mxxikr;

public class Choice {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;

		int n = 20;

		// if-else문
		if (a == 1)
			if (b == 2)
				System.out.println("a was 1 and b was 2.");
			else // if (b == 2)와 짝지어진 else문
				System.out.println("a wasn't 1.");

		// switch문
		switch (n) {
		case 10:
			System.out.println("10입니다.");
			break;
		case 20:
		case 30:
			System.out.println("20이거나 30입니다.");
			break;
		default:
			System.out.println("모르겠습니다.");
			break;
		}
	}
}
