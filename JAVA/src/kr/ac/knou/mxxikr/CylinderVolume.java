package kr.ac.knou.mxxikr;

public class CylinderVolume {
	public static void main(String args[]) {
		CircleCalc c = new CircleCalc(7); // CircleCalc 생성자 이용해 객체 생성
		int h = 8;
		Cylinder cy = new Cylinder(c, h); // Cylinder 생성자 이용해 객체 생성 c=c, h=h
		System.out.println(cy.getVolume()); // c * c * 3.14 * h
	}
}
