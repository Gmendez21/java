package com.class17_2.copy;

public class CarMileage {

	public static void main(String[] args) {
	
	CarMileage obj = new CarMileage();
	
	obj.car();
	
	}

		void car() {
		
		for (int a = 0; a <= 9; a++) {

			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {

					for (int d = 0; d <= 9; d++) {

						System.out.println(a + "" + b + "" + c + "" + d);

					}
				}
			}
		}
	}}


// solves the inner loop first until condition is solved, then goes into the loop outside the innerest loop??? 
//practice this 