package kr.ac.knou.mxxikr;

class IniTest {
	static int nValue = 1; // �ʱⰪ �������� ������� 0���� �ڵ� �ʱ�ȭ

	static {
		nValue = 2;  // Ŭ���� ���� �ʱ�ȭ ���
	}
	
	public IniTest() {
		nValue = 3; // �ʱⰪ ����
	}
	
	public static void main(String[] args) {
		System.out.print(nValue); // �ι� �ʱ�ȭ�� 2 ���
	}
}