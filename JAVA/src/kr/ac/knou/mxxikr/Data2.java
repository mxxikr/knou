package kr.ac.knou.mxxikr;

class Data2<T> {
	private T t;

	Data2(T t) {
		set(t);
	}

	Data2() {
	}

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}