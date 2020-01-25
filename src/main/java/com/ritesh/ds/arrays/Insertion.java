package com.ritesh.ds.arrays;

public class Insertion
{
	private void insertElement()
	{
		Integer[] strArray = {1, 2, 3, 4, 5, 6, 7};
		int K = 1;
		int size = strArray.length;
		int newSize = size+1;
		int start = size - 1;
		int end = K - 1;

		Integer[] intArrayNew = new Integer[newSize];
		for(int i = start; i >= end; i--)
		{
			intArrayNew[i+1] = strArray[i];
		}
		intArrayNew[K-1] = 8;
		for(int i : intArrayNew)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Insertion insertion = new Insertion();
		insertion.insertElement();
	}
}