package com.bridgelabs.HashTables;

public class Main {

	public static void main(String[] args) {
		String s = "To be or not to be";

		HashTable<String, Integer> table = new HashTable<>(20);

		FindFrequency.WordFrequency(s, table);

		table.getAllValues();

	}

}
