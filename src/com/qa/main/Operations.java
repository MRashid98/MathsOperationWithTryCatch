package com.qa.main;

public class Operations {

	public int add(int a, int b) {
		return a + b;
	}

	public int substr(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public int div(int a, int b) {
		try {

			if (a < b) {
				throw new NumberFormatTooBigException();
			} else {
				return a / b;
			}
		} catch (NumberFormatTooBigException nftbe) {
			System.out.println("Catching exception from nftbe class");
			nftbe.printStackTrace();
			return 0;
		} catch (RuntimeException rte) {
			System.out.println("Runtime Exception");
			return 0;
		}
	}

	public int indices(int a, int b) {
		return (int) Math.pow(a, b);
	}
}
