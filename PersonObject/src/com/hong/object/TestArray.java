package com.hong.object;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{5,8,-1,10,15,3,1};
		ArrayUtil a1 = new ArrayUtil();
		
		a1.printArray(arr);
		int total = a1.getSum(arr);
		System.out.println(total);
	}

}
