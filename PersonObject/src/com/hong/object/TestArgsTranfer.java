package com.hong.object;
/*
 * ���������Ĵ���
 */
public class TestArgsTranfer {
// ����ʵ����ֵ����
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
	// ��������
	public void swap(int i, int j){
		int temp = i;
		i = j;
		j = temp;
	}

}
