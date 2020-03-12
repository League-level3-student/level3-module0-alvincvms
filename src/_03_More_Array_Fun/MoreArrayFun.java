package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] S = new String[3];
		S[0] = "1";
		S[1] = "2";
		S[2] = "3";
		PS(S);
		PRS(S);
	}
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void PS(String[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void PRS(String[] s) {
		for(int i = s.length-1; i > -1; i--) {
			System.out.println(s[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
