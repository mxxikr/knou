package kr.ac.knou.mxxikr;

public class Company1 {
	public static void main(String args[]) {
		Employee emp1, emp2; // 클래스 객체 변수 정의

		emp1 = new Sales();
		emp2 = new Development();

		emp1.doJob(); // Employee의 doJob 메소드 존재 확인 후 Sales 클래스의 doJob 메소드 호출
		emp2.doJob(); // Development 클래스의 doJob 메소드 호출
	}
}
// 출력 결과
// Do sales
// Do development
