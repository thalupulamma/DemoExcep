package com.demo;

public class DemoProgram3 {
	public static void main(String[] args) {
		int i,j,k=0;
		i = 10;
		j = 2;
		int p[] = new int[4];
		try {
			k = i/j;
			
			for(int count=0; count <=4; count++) {
				p[count] = count+1;
			}
			for(int g : p) {
				System.out.println(g);
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		System.out.println(k);
		System.out.println("Program End");
	}
}
