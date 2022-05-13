package kr.ac.knou.mxxikr;

class A {
	public void func() {
		System.out.println("a");
	}
}

class B extends A {
	public void func() {
		System.out.println("b");
	}
}

class C extends B {
	public void func() {
		System.out.println("c");
	}
}