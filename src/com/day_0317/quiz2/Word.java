package com.day_0317.quiz2;

public class Word {private String letters;

public Word(String letters) {
	this.letters = letters;
}

public boolean isVowel(int i) {
	String[] words = { "a", "e", "i", "o", "u" };
	for (String word : words) {
		if (letters.substring(i, i + 1).equals(word)) {
			return false;
		}

	}
	return true;
}

public static void main(String[] args) {
	Word word = new Word("dksljfoia");
	System.out.println(word.isVowel(0));

}

}
