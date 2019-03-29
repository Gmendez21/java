package com.class12;

public class Array2Dpractice {

	public static void main(String[] args) {

		String[][] groceries = { { "oranges", "apples", "bananas" },
				                 { "carrots", "broccoli", "spinach" },
				                 { "milk", "cheese", "sour cream" }

		};

		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries.length; j++) {
				System.out.print(groceries[i][j] + " ");
			}
                System.out.println();
		}
	}
}
