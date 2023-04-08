package com.company.calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new BasicCalc();
		double result1 = calculator.add(10, 5);
	    double result2 = calculator.subtract(10, 5);
	    double result3 = calculator.multiply(10, 5);
	    double result4 = calculator.divide(5, 2);
	    System.out.println("Addition: " + result1);
	    System.out.println("Subtraction: " + result2);
	    System.out.println("Multiplication: " + result3);
	    System.out.println("Division: " + result4);
	}

}
