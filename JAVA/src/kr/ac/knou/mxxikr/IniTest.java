package kr.ac.knou.mxxikr;

class IniTest {
	static int nValue = 1; // 초기값 선언하지 않을경우 0으로 자동 초기화

	{
		nValue = 2; // 클래스 변수 초기화 블록
	}

	public IniTest() {
		nValue = 3; // 초기값 변경
	}

	public static void main(String[] args) {
		IniTest n = new IniTest(); // 생성자 호출을 통해 초기화 실행
		System.out.println(IniTest.nValue); // 생성자를 통해 초기화된 3 출력
	}
}