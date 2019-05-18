package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoProgram7 {

	public static void main(String[] args) throws IOException {
	try (BufferedReader b = new BufferedReader(new InputStreamReader(System.in))) {
		System.out.println("Please enter a name:");
		String s = b.readLine();
		System.out.println("Welcome:" + s);
	} 
		System.out.println("Program End");
	}

}
