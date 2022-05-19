package kr.ac.knou.mxxikr;

enum BaseballTeam {
	LG(40, 30), SS(30, 40), KT(20, 50),	SK(35, 35), NC(55, 15); // 상수 값 선언

	private final int win; // 데이터 필드 선언
	private final int lose;

	private BaseballTeam(int win, int	lose) { // 생성자
		this.win = win; 
		this.lose = lose;
	}

	public double winsRate( ) {
		return (win * 100.0) / (win + lose);
	}
}

public class EnumTest2 {
	public static void main(String args[ ]) {
		BaseballTeam bt = BaseballTeam.LG;

		System.out.println(bt.winsRate( )); // win = 40, lose 30값 대입 -> 4000 / 70
	}
}