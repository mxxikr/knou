package kr.ac.knou.mxxikr;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner ��ü ����
		while (sc.hasNextInt()) { // �ܾ� �Է� �� �˻�
			System.out.println(sc.nextInt());
		}
	}
}
