package kr.ac.knou.mxxikr;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 인자로 표준 입력 이용해 객체 생성
		String name = sc.next(); // 단어를 읽어 String으로 반환
		System.out.println(name);
	}
}
