package com.Collections;

import java.util.ArrayList;

public class AnagramProgram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";

		ArrayList<Character> a1 = new ArrayList();
		ArrayList<Character> a2 = new ArrayList();

		// Adding characters into arraylist

		for (int i = 0; i < s1.length(); i++) {
			a1.add(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			a2.add(s2.charAt(i));
		}

		// Checking Anagrams

		if (a1.size() == a2.size() && a1.containsAll(a2)) {
			for (int i = 0; i < a1.size(); i++) {
				a2.remove(a1.get(i));

			}

			if (a2.isEmpty()) {
				System.out.println("Anagrams");
			} else {
				System.out.println("Not Anagrams");
			}
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
