package kr.ac.knou.mxxikr;

public class CylinderVolume {
	public static void main(String args[]) {
		CircleCalc c = new CircleCalc(7); // CircleCalc 积己磊 捞侩秦 按眉 积己
		int h = 8;
		Cylinder cy = new Cylinder(c, h); // Cylinder 积己磊 捞侩秦 按眉 积己 c=c, h=h
		System.out.println(cy.getVolume()); // c * c * 3.14 * h
	}
}
