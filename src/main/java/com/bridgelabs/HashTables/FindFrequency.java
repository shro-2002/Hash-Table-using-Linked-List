package com.bridgelabs.HashTables;

public class FindFrequency {

	/*
	 * @description:Inserting words as key and frequency as values in paragraph/line
	 * 
	 * @param: String, HashTable
	 * 
	 * @return: void
	 */

	public static void WordFrequency(String s, HashTable<String, Integer> table) {

		String[] arr = s.toLowerCase().split(" ");

		for (String i : arr) {
			Integer Value = table.getKey(i);

			if (Value == null)
				table.insert(i, 1);
			else
				table.updateTable(i, Value + 1);

		}
	}

}
