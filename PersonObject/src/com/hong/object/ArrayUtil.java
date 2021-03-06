package com.hong.object;

public class ArrayUtil {
	//数组最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	//数组最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	//遍历数组
	public void printArray(int[] arr){
		System.out.print("[");
		for(int i = 0;i < arr.length; i++){
			System.out.print(arr[i] + "\t");		
		}
		System.out.println("]");
	}
	//数组平均数
	public int avg(int[] arr){
		int total = getSum(arr);
		return total / arr.length;
	}
	//数组总和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	// 数组反转
	public int[] reverse(int[] arr){
		for(int x = 0,y = arr.length - 1;x < y;x++,y--){
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		return arr;
	}
	// 数组排序
	public void sort(int[] arr){
		//冒泡排序
		for(int i = 0;i < arr.length-1;i++){
			for(int j = 0;j < arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	

}
