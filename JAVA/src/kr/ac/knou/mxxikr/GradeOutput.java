package kr.ac.knou.mxxikr;

class Grade {
	int e; // ���� ������ ���� �ʵ�
	int m; // ���� ������ ���� �ʵ�

	void input_grade(int a, int b) {
		e = a; // ���� ���� �Է�
		m = b; // ���� ���� �Է�
	}

	void output_grade() {
		// ���� ��� �޼ҵ�
		System.out.println(e + m);
	}
}

public class GradeOutput {
	public static void main(String args[]) {
		Grade g1, g2; // ������ ǥ���ϴ� ��ü

		g1 = new Grade(); // ��ü ����
		g2 = new Grade();

		g1.input_grade(90, 85); // ���� �Է�
		g2.input_grade(80, 80);

		g1.output_grade(); // ���� ���
		g2.output_grade();
	}
}
