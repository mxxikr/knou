package kr.ac.knou.mxxikr;



public class EnumDay {
	enum Day { // Enum 유형 Day
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	public static void main(String[] args) {
		Day day = Day.MONDAY;
		System.out.println(day);

		for (Day d : Day.values( )) {
			System.out.println(d); // 각 원소 출력
		}
	}
}
