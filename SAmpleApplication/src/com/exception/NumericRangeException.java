package com.exception;

public class NumericRangeException extends Exception{
	static int number;
	public NumericRangeException(int n)
	{
		super("invalid value"+n);
		number=n;
	}

	public static void main(String[] args) {
		System.out.println("invalid values entered"+number);

	}

}
