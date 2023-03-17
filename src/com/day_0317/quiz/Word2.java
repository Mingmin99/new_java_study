package com.day_0317.quiz;

public class Word2 {private String letters;

public Word2(String letters) {
	this.letters = letters;
}

public boolean isVowel(int i) {
	String[] words = { "a", "e", "i", "o", "u" };
	for (String word : words) {
		if (letters.substring(i, i + 1).equals(word)) {
			return true;
		}

	}
	return false;
}

public static void main(String[] args) {
	Word word = new Word("dksljfoia");
	System.out.println(word.isVowel(0));

}

}