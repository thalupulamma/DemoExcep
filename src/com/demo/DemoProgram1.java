package com.demo;

public class DemoProgram1 {

	public static void main(String[] args) {
		int i,j,k=0;
		i = 10;
		j = 0;
		try {
			k = i/j;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println(k);
	}

}
