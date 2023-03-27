package chap06;

import java.util.Arrays;

public class BubbleSortTest3 {
	
	void swap(int [] arr, int idx1, int idx2) {
		System.out.printf("[%d , %d ]",arr[idx1],arr[idx2]);
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.printf("[%d , %d ]\n",arr[idx1],arr[idx2]);
	}
	
	void bubbleSort(int [] arr) {
		int sortStartIdx = 0;
		
		while(sortStartIdx < arr.length-1) {
			int lastSwapIdx = arr.length-1; 
			for(int j = arr.length-1; j>sortStartIdx; j--) {
				if( arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
					lastSwapIdx = j;
					}
				}
			sortStartIdx = lastSwapIdx;
		}
	}
	
	

	public static void main(String[] args) {
		int [] arr = {1, 6, 4, 3, 2 ,7, 8, 9};
		BubbleSortTest3 bs = new BubbleSortTest3(); 
		
		
		System.out.println(Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
