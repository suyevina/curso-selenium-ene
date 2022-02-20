package com.java.extra_task;

public class SimpleCalculator {
	double firstNumber;
	double secondNumber;
	
	public SimpleCalculator() {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		double sum=firstNumber+secondNumber;
		return sum;		
	}
	
	public double getSubtractionResult() {
		double res = secondNumber - firstNumber;
		return res;
	}
	
	public double getMultiplicationResult() {
		double mult= firstNumber*secondNumber;
		return mult;		
	}
	
	public double getDivisionResult() {
		if(secondNumber != 0) {
			double div=firstNumber/secondNumber;
			return div;
		}else {
			return 0;
		}
	}

}
