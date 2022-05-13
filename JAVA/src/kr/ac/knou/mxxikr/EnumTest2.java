package kr.ac.knou.mxxikr;

enum BaseballTeam {
	LG(40, 30), SS(30, 40), KT(20, 50),	SK(35, 35), NC(55, 15); // ��� �� ����

	private final int win; // ������ �ʵ� ����
	private final int lose;

	private BaseballTeam(int win, int	lose) { // ������
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

		System.out.println(bt.winsRate( )); // win = 40, lose 30�� ���� -> 4000 / 70
	}
}