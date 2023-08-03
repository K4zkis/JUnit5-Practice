package com.ivmedia.TaxTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ivmedia.TaxExercise.TaxCalculator;



public class TaxCalculatorTests {

	@Test
	public void salariesOver150_000_return_45_percent() {
		//Arrange
		TaxCalculator taxCalculator = new TaxCalculator();
		int salary = 160000;
		//Act
		int returnedTax = taxCalculator.calculateTax(salary);
		//Assert
		assertEquals(45,returnedTax);
	}
}
