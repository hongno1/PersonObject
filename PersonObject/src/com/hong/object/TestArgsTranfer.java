package com.hong.object;
/*
 * 方法参数的传递
 */
public class TestArgsTranfer {
// 不能实现数值交换
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestArgsTranfer tt = new TestArgsTranfer();
		int i = 10;
		int j =5;
		
		System.out.println("i:" + i + "\t"+ "j:" + j);
		
//		int temp = i;
//		i = j;
//		j = temp;
		tt.swap(i, j);
		System.out.println("i:" + i + "\t"+ "j:" + j);
	
	}
	// 交换方法
	public void swap(int i, int j){
		int temp = i;
		i = j;
		j = temp;
	}

}
