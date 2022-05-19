package kr.ac.knou.mxxikr;

public class GenericsTest2 {
	public static void main(String args[ ]) {
		Data2<String> data = new Data2<String>( );
		Integer i = new Integer(20);
//		data.set((String)i); //컴파일 오류
		String s = new String("String s");
		data.set(s);
		String string = (String) data.get();
		System.out.println(s);
		System.out.println(string);
	}
}