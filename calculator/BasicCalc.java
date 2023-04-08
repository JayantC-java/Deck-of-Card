package com.company.calculator;

public class BasicCalc implements Calculator {

	@Override
	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double subtract(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public double multiply(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public double divide(double num1, double num2) {
		// TODO Auto-generated method stub
		if(num2==0) {
			throw new IllegalArgumentException("Can not divide by zero");
		}
		return num1/num2;
	}
	

}
