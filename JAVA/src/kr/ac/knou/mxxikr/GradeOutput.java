package kr.ac.knou.mxxikr;

class Grade {
	int e; // 영어 성적을 위한 필드
	int m; // 수학 성적을 위한 필드

	void input_grade(int a, int b) {
		e = a; // 영어 성적 입력
		m = b; // 수학 성적 입력
	}

	void output_grade() {
		// 총점 출력 메소드
		System.out.println(e + m);
	}
}

public class GradeOutput {
	public static void main(String args[]) {
		Grade g1, g2; // 성적을 표현하는 객체

		g1 = new Grade(); // 객체 생성
		g2 = new Grade();

		g1.input_grade(90, 85); // 성적 입력
		g2.input_grade(80, 80);

		g1.output_grade(); // 총점 출력
		g2.output_grade();
	}
}
