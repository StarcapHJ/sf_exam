package com.stc.exam;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] array = {4,5,10,22,80,11};
		
		printArrayValue(array);
	
		
		
	}
	
	public static void printArrayValue(int[] array2) {
		int sumi=0;
	/*	for(int i = 0; i < array2.length; i++)
		{
			sumi += array2[i];
		} */
		
		for(int i : array2) {
			System.out.println(i);
			sumi += i;
		}
		
	//	System.out.printf("%d",sumi);
		
		
	}
}


