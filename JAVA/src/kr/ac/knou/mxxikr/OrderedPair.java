package kr.ac.knou.mxxikr;

interface Pair<K, V> { // 타입 매개변수 2개 존재
	public K getKey();
	public V getValue();
}

class OrderedPair <K, V> implements Pair <K, V> { // 제네릭 클래스 정의
	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey( ) { return key; }
	public V getValue( ) { return value; }
}