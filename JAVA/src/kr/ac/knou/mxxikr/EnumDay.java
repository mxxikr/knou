package kr.ac.knou.mxxikr;



public class EnumDay {
	enum Day { // Enum ���� Day
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	public static void main(String[] args) {
		Day day = Day.MONDAY;
		System.out.println(day);

		for (Day d : Day.values( )) {
			System.out.println(d); // �� ���� ���
		}
	}
}
