package com.bridgelabs.HashTables;

/*
 * @CLass Variables: head
 * 
 * @Class Methods: insertAtbegin,insertAtEnd,insertAfter,pop,popLast,deleteGivenNode,search, display
 * 
 * @Description: Create a linked list using Generics in Java
 */

public class LinkedList<K, V> {

	private MyMapNode<K, V> head;

	public MyMapNode<K, V> getHead() {
		return head;
	}

	/*
	 * @Description: Inserting a new node at the end of the Linked List
	 * 
	 * @params: T data
	 * 
	 * @return : void
	 */
	public void insertAtEnd(K key, V value) {
		MyMapNode<K, V> newNode = new MyMapNode<K, V>(key, value);
		if (head == null) {
			head = newNode;
			return;
		}
		MyMapNode<K, V> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	/*
	 * @Description: Deleting a Given key in the Linked List
	 * 
	 * @params: T
	 * 
	 * @return : void
	 */
	public void deleteGivenNode(K key) {

		if (head == null)
			return;

		if (head.key.equals(key)) {
			head = head.next;
			return;
		}

		MyMapNode<K, V> temp = head;
		MyMapNode<K, V> prev = null;

		while (temp != null) {
			if (temp.key.equals(key)) {
				prev.next = temp.next;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	/*
	 * @Description: Searching for a Given key in the Linked List
	 * 
	 * @params: K
	 * 
	 * @return : V
	 */
	public V search(K key) {
		if (head == null)
			return null;

		MyMapNode<K, V> temp = head;

		while (temp != null) {
			if (temp.key.equals(key))
				return temp.value;
			temp = temp.next;
		}

		return null;

	}

	/*
	 * @Description: Updating the value of a given key in the Linked List
	 * 
	 * @params:K,V
	 * 
	 * @return : void
	 */
	public void update(K key, V value) {
		if (head == null)
			return;

		MyMapNode<K, V> temp = head;

		while (temp != null) {
			if (temp.key.equals(key))
				temp.value = value;
			temp = temp.next;
		}

		return;

	}

	/*
	 * @Description: Displaying the Linked List
	 * 
	 * @params: void
	 * 
	 * @return : void
	 */

	public void display() {
		MyMapNode<K, V> temp = head;
		while (temp != null) {
			System.out.println("Key: " + temp.key + " ");
			System.out.println("Value: " + temp.value + " ");
			temp = temp.next;
		}
	}

}
