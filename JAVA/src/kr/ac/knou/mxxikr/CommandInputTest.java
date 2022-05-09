package kr.ac.knou.mxxikr;

public class CommandInputTest {
	public static void main(String args[]) { // 매개변수 빈칸으로 구분
		System.out.println(args[0]);
		int n = Integer.parseInt(args[1]); // 문자열을 integer 형식으로 변환
		System.out.println(n);
	}
}