package kr.ac.knou.mxxikr;

public class ArraySize {
	public static void main(String[] args) {
		int twoArray[][] = { { 0, 1 }, { 10, 11, 12 } }; // ����� ���ÿ� �ʱ�ȭ
		for (int i = 0; i < twoArray.length; i++) {
			for (int j = 0; j < twoArray[i].length; j++) {
				System.out.println(twoArray[i][j]);
			}
		}
	}
}
