package kr.ac.knou.mxxikr;

public class Company1 {
	public static void main(String args[]) {
		Employee emp1, emp2; // Ŭ���� ��ü ���� ����

		emp1 = new Sales();
		emp2 = new Development();

		emp1.doJob(); // Employee�� doJob �޼ҵ� ���� Ȯ�� �� Sales Ŭ������ doJob �޼ҵ� ȣ��
		emp2.doJob(); // Development Ŭ������ doJob �޼ҵ� ȣ��
	}
}
// ��� ���
// Do sales
// Do development
