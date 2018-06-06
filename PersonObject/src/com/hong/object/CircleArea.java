package com.hong.object;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		c1.r = 2;
		c1.area();
	}

}


class Circle{
	double r;
	
	public void area(){
		System.out.println(3.14 * r * r);
	}	
	
}
