package kr.ac.knou.mxxikr;

interface Pair<K, V> { // Ÿ�� �Ű����� 2�� ����
	public K getKey();
	public V getValue();
}

class OrderedPair <K, V> implements Pair <K, V> { // ���׸� Ŭ���� ����
	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey( ) { return key; }
	public V getValue( ) { return value; }
}