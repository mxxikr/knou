package kr.ac.knou.mxxikr;

class Data {
	private Object object; // java의 클래스 계층 구조에서 가장 상위 구조

	public void set(Object object) {
		this.object = object;
	} // 데이터필드 세팅

	public Object get() {
		return object;
	}
}
