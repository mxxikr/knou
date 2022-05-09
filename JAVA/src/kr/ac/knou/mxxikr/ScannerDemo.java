package kr.ac.knou.mxxikr;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner °´Ã¼ »ý¼º
		if (sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		} else {
			System.out.println("It's not Integer");
		}
	}
}
