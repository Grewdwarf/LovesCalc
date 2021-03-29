package com.assign2.calculator.Main;

import com.assign2.calculator.classes.ScientificCalculator;
import com.assign2.calculator.classes.SimpleCalculator;

public class MyCalcTest {	//MAIN
	public static void main(String[] args) {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		System.out.println(simpleCalculator.addition(3.3, 4.5));

		ScientificCalculator scientificCalculator = new ScientificCalculator();
		System.out.println(scientificCalculator.square(10.0));
	}
}