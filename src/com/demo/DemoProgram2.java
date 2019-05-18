package com.demo;

public class DemoProgram2 {
	public static void main(String[] args) {
		int p[] = new int[4];
		try {
			for(int count=0; count <=4; count++) {
				p[count] = count+1;
			}
			for(int g : p) {
				System.out.println(g);
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		
		System.out.println("Program End");
	}
}
