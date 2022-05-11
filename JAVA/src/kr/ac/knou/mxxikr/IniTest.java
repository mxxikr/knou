package kr.ac.knou.mxxikr;

class IniTest {
	int nValue = 1; // 초기값 선언하지 않을경우 0으로 자동 초기화
	{
		nValue = 2; // 인스턴스 변수 초기값 변경
	}

	public IniTest() {
		nValue = 3; // 초기값 변경
	}
}