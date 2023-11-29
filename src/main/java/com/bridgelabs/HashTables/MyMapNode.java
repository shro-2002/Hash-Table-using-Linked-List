package com.bridgelabs.HashTables;

/*
 * @Description: Structure of the node of the linked list in Hash Table
 * 
 * @Class Variables: key, value, next
 * 
 * @Class Methods: Constructor, getKey, getValue, setKey, setValue, getNext, setNext
 */

public class MyMapNode<K, V> {

	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;

	}

}
