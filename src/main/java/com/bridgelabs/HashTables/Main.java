package com.bridgelabs.HashTables;

public class Main {

	public static void main(String[] args) {
		String s = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		HashTable<String, Integer> table = new HashTable<>(20);

		FindFrequency.WordFrequency(s, table);
		
		table.delete("avoidable");

		table.getAllValues();

	}

}
