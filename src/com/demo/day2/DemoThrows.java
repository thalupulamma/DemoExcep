package com.demo.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoThrows {
	public static void main(String[] args) {
		try {
			System.out.println("Hai....");
			callFun1();
		} catch (ArrayIndexOutOfBoundsException | IOException | ArithmeticException e ) {
			e.printStackTrace();
		}
		System.out.println("Program Ends");
	}

	private static void callFun1() throws IOException, ArrayIndexOutOfBoundsException{
		callFun2();
		int p[] = new int[4];
		for(int count=0; count <= 4; count++) {
			p[count] = count+1;
		}
		for(int g : p) {
			System.out.println(g);
		}
		System.out.println("callFun1 Ends");
	}
	
	private static void callFun2() throws IOException, ArithmeticException{
		int i = 8, j = 0, k = 0;
		System.out.println("Please enter a number:");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		j = Integer.parseInt(b.readLine());
		k = i /j;
		System.out.println(k);
		System.out.println("callFun2 Ends");
	}
}
