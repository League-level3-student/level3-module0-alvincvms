package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] a = new String[5];
		//2. print the third element in the array
		System.out.println(a[3]);
		//3. set the third element to a different value
		a[3] = "bruh";
		//4. print the third element again
		System.out.println(a[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < a.length; i++) {
			a[i] = "YEET";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//7. make an array of 50 integers
		int[] I = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < I.length; i++) {
			I[i] = new Random().nextInt(1025);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int SN;
		SN = I[0];
		for(int i = 1; i < I.length; i++) {
			if(SN > I[i]) {
				SN = I[i];
			}
		}
		System.out.println(SN);
		
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < I.length; i++) {
			System.out.println(I[i]);
		}
		//11. print the largest number in the array.
		int LN;
		LN = I[0];
		for(int i = 1; i < I.length; i++) {
			if(LN < I[i]) {
				LN = I[i];
			}
		}
		System.out.println(LN);
		//12. print only the last element in the array
		System.out.println(I[I.length-1]);
	}
}
