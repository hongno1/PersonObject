package com.hong.object;

public class TestArgsTran {
// �β��������������ͣ���ʵ�ֽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArgsTran tt = new TestArgsTran();
		DataSwap ds = new DataSwap();
		System.out.println("i:"+ ds.i + "\t" + "j:" + ds.j);
		
		tt.swap(ds);
		
		System.out.println("i:"+ ds.i + "\t" + "j:" + ds.j);

	}
	public void swap(DataSwap d){
		int temp = d.i;
		d.i = d.j;
		d.j = temp;
	}

}

class DataSwap{
	int i = 10;
	int j = 5;
}