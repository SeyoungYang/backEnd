package chap06;

import java.util.Arrays;

public class BubbleSortTest2 {
	
	void swap(int [] arr, int idx1, int idx2) {
		System.out.printf("[%d , %d ]",arr[idx1],arr[idx2]);
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.printf("[%d , %d ]\n",arr[idx1],arr[idx2]);
	}
	
	void bubbleSort(int [] arr) {
		for(int i = 0 ; i < arr.length -1; i++) {
			int num=0;
			for(int j = arr.length-1; j>i; j--) {
			if( arr[j-1] > arr[j]) {
				swap(arr, j-1, j);
				num++;
				}
			}
			if(num == 0) break;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 6, 4, 3, 2 ,7, 8, 9};
		BubbleSortTest2 bs = new BubbleSortTest2(); 
		
		
		System.out.println(Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
