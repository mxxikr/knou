package kr.ac.knou.mxxikr;

public class Repetition {
	public static void main(String[] args) {
		int[ ] a = {32, 87, 3, 589, 12 }; 
		int[] array0fInts = { 32, 87, 3, 589, 12, 1076, 2000, 8 };
		
		for (int i = 0; i < a.length; i++)   
		      System.out.print( a[i] + " ");
		System.out.print("\n");
		
		for (int element : array0fInts) {
			System.out.print(element + " ");
		}
		System.out.println("\n"+ array0fInts); // 32 87 3 589 12 1076 2000 8
	}
}
