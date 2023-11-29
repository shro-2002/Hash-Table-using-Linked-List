package com.bridgelabs.HashTables;

import java.util.ArrayList;

/*
 * @ Description: This is the class where we are creating the Hash Table
 * 
 * @Class variables: bucketArray[] is the array of linked list, capacity is the size of the array
 * 
 * @Class Methods: 
 */

public class HashTable<K, V> {
	private LinkedList<K, V>[] bucketArray;
	private int capacity;

	/*
	 * @description: initializing the capacity of the array and initializing the
	 * lists of linked list
	 * 
	 * @param: capacity is the size of the array
	 * 
	 * @return: void
	 */
	public HashTable(int capacity) {
		this.capacity = capacity;
		this.bucketArray = new LinkedList[capacity];

		for (int i = 0; i < capacity; i++)
			this.bucketArray[i] = new LinkedList<>();
	}

	/*
	 * @description:Calculate the hashCode of key
	 * 
	 * @param: key
	 * 
	 * @return: HashCode of the key
	 */

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % capacity;
		return index;
	}

	/*
	 * @description:Insert a key-value pair
	 * 
	 * @param: K,V
	 * 
	 * @return: void
	 */
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		bucketArray[bucketIndex].insertAtEnd(key, value);

	}

	/*
	 * @description:Delete a key-value pair using Key
	 * 
	 * @param: K
	 * 
	 * @return: void
	 */
	public void delete(K key) {
		int bucketIndex = getBucketIndex(key);
		bucketArray[bucketIndex].deleteGivenNode(key);
	}

	/*
	 * @description:Search a Given Key
	 * 
	 * @param: K
	 * 
	 * @return: V
	 */

	public V getKey(K key) {
		int bucketIndex = getBucketIndex(key);
		return bucketArray[bucketIndex].search(key);

	}

	/*
	 * @description:Update the table if key has been previously inserted
	 * 
	 * @param: K,V
	 * 
	 * @return: void
	 */

	public void updateTable(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		bucketArray[bucketIndex].update(key, value);
	}

	/*
	 * @description:Display the keys and values in table
	 * 
	 * @param: void
	 * 
	 * @return: void
	 */
	public void getAllValues() {

		for (LinkedList<K, V> linkedList : bucketArray) {
			linkedList.display();
		}

	}

}
