package com;
public class Sample {
	public void addArray(int[] arr)
	{
		for (int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {	
		try
		{
			Sample obj=new Sample();
			int[]arr= {12,23,11,19};
			obj.addArray(arr);
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Array index out of range");
		}
		

	}

}
