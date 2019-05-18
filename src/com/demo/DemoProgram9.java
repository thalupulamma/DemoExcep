package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoProgram9 {

	public static void main(String[] args) throws IOException {
		int i = 8, j = 0, k = 0;
		BufferedReader b = null;
		try {
			System.out.println("Please enter a number:");
			b = new BufferedReader(new InputStreamReader(System.in));

			j = Integer.parseInt(b.readLine());

			k = i + j;

			if (k < 10) {
				throw new MyException("Error");
			}

		}  catch (Exception e) {
			System.out.println(e);
		} finally {
			b.close();
			System.out.println("Executed Finally block.");
		}

		System.out.println(k);
		System.out.println("Program End");
	}

}
