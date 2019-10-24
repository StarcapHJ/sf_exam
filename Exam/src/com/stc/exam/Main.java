package com.stc.exam;

public class Main {
	public static void main(String[] args) {
		
		printStar(5);
		printStar(6);
		printStar(9);
	}
	
	public static void printStar(int line) {
		System.out.println("printStar");
		
		
		for(int i = 0; i < line; i++)
		{
			for(int j = 0; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
