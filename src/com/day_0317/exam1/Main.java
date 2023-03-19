package com.day_0317.exam1;

import com.day_0317.exam1.StrongBox.KeyType;

public class Main  {

	public static void main(String[] args) {
		StrongBox strongBox = new StrongBox(KeyType.PADLOCK);
		strongBox.put("돈 ");

		for(int i=0; i<15; i++) {
			System.out.println(strongBox.get());
		}
	}

}
