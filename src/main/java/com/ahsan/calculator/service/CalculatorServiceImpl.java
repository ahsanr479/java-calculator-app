package com.ahsan.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public long add(long a, long b) {
		long sum = a + b;
		return sum;
	}

	@Override
	public long substract(long a, long b) {
		// TODO Auto-generated method stub
		long total = a - b;
		return total;
	}

	@Override
	public long divide(long a, long b) {
		// TODO Auto-generated method stub
		long total = a / b;
		return total;
	}

	@Override
	public long multiply(long a, long b) {
		// TODO Auto-generated method stub
		long total = a * b;
		return total;
	}

}
