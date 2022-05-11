package kr.ac.knou.mxxikr;

class IniTest {
	static int nValue = 1; // 초기값 선언하지 않을경우 0으로 자동 초기화

	static {
		nValue = 2;  // 클래스 변수 초기화 블록
	}
	
	public IniTest() {
		nValue = 3; // 초기값 변경
	}
	
	public static void main(String[] args) {
		System.out.print(nValue); // 두번 초기화된 2 출력
	}
}