package com.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoProgram6 {
	public static void main(String[] args) throws Exception {
		int i, j = 1, k = 0;
		i = 100;
		BufferedReader b = null;
		try {
			System.out.println("Please enter a number:");
			b = new BufferedReader(new InputStreamReader(System.in));

			j = Integer.parseInt(b.readLine());

			k = i / j;

		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			b.close();
			System.out.println("Executed Finally block.");
		}

		System.out.println(k);
		System.out.println("Program End");
	}
}
