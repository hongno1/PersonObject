package com.hong.object;

public class PersonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.age = 20;
		p1.study();
		p1.showAge();
		p1.addAge(2);
		p1.showAge();
		

	}

}


class Person{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println(age);
	}
	
	public int addAge(int i){
		age +=i;
		return age;
	}
	
}
