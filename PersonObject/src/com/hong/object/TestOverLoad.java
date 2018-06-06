package com.hong.object;

public class TestOverLoad {
	// ·½·¨ÖØÔØ
	public static void main(String[] args) {
		TestOverLoad t1 = new TestOverLoad();
		t1.mOL(5);
		t1.mOL("hahahaha");
		t1.mOL(3, 5);
	}

	public void mOL(int a){
		System.out.println(a * a);
	}
	public void mOL(int a, int b){
		System.out.println(a * b);
	}
	public void mOL(String str){
		System.out.println(str);
	}
}
