package com.hong.object;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.info();
		c1.name = "法拉利";
		c1.wheel = 4;
		c1.info();
		
		Car c2 = new Car();
		c2.setName(6);
		c2.setName("劳斯莱斯");
		
		c2.info();
		
		Factory f = new Factory();
		Car c3 = f.produceCar("宝马", 4);
		c3.info();
		
	}

}

class Factory{
	// 方法重载
	
	public Car produceCar(){
		return new Car();
	}
	
	public Car produceCar(String n, int w){
		Car c = new Car();
		c.name = n;
		c.wheel = w;
		return c;
	}
	
	public void describeCar(Car c){
		c.info();
	}
}

class Car{
	String name;
	int wheel;
	
	public void info(){
		System.out.println("name:" + name + "\t" + "wheel:" + wheel);
	}
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setName(int w){
		wheel = w;
	}
	
}
 