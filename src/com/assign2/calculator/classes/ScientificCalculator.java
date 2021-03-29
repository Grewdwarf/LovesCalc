package com.assign2.calculator.classes;

import com.assign2.calculator.interfaces.AdvancedMathOperations;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {
	public double square(double number) {
		return number * number;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}
}