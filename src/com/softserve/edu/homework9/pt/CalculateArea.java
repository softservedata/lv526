package com.softserve.edu.homework9.pt;

class CalculateArea {

	public int squareRectangle(int a, int b) throws CalculateException {
		
		if (a < 0 || b < 0) {
			throw new CalculateException("A negative number cannot be used!");
		} else {
			return a * b;
		}

	}
}