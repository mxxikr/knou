package kr.ac.knou.mxxikr;

class IniTest {
	int nValue = 1; // �ʱⰪ �������� ������� 0���� �ڵ� �ʱ�ȭ

	{
		nValue = 2; // Ŭ���� ���� �ʱ�ȭ ���
	}

	public IniTest() {
		nValue = 3; // �ʱⰪ ����
	}

	public static void main(String[] args) {
		IniTest n = new IniTest(); // ������ ȣ��
		System.out.println(n.nValue); // �����ڸ� ���� �ʱ�ȭ�� 3 ���
	}
}