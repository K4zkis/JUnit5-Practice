package com.ivmedia.TaxExercise;

public class TaxCalculator {

	public int calculateTax(int salary) {
		if (salary > 150000) {
			return 45;
		}
		else if (salary > 50000) {
			return 40;
		}
		else if (salary > 125000) {
			return 20;
		}
		else return 0;
	}
}
