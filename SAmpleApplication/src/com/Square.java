package com;
public class Square implements Shape,Color{
	public void draw()
	{
		System.out.println("draw the shape");
	}
	public void fill()
	{
		System.out.println("fill the color");
	}
	public static void main(String[] args)
	{
		Square obj =new Square();
		obj.draw();
		obj.fill();
	}
}
