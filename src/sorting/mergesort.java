package sorting;

import org.apache.commons.lang3.ArrayUtils;

import utils.Utils;

public class mergesort {

	public static void main(String[] args) {
		int[] arr = new int[] {9,5,-70,3,80,4,6,1,2, 100,50,75, 32, 45, 56, 12};

		int index1 = arr.length / 2;
		int[] left = ArrayUtils.subarray(arr, 0, index1);
		int[] right = ArrayUtils.subarray(arr, index1, arr.length);

		int[] sorted = merge(left, right);

		Utils.printArray(sorted);
	}

	private static int[] merge(int[] arr1, int[] arr2) {

		if(arr1.length == 1 && arr2.length == 1) {
			if(arr1[0] < arr2[0])
				return new int[] { arr1[0], arr2[0] };
			else
				return new int[] { arr2[0], arr1[0] };
		}

		int index1 = arr1.length / 2;
		int[] left1 = ArrayUtils.subarray(arr1, 0, index1);
		int[] right1 = ArrayUtils.subarray(arr1, index1, arr1.length);

		int[] arr1Sorted = merge(left1, right1);

		int index2 = arr2.length / 2;
		int[] left2 = ArrayUtils.subarray(arr2, 0, index2);
		int[] right2 = ArrayUtils.subarray(arr2, index2, arr2.length);

		int[] arr2Sorted = merge(left2, right2);
		int[] sorted = new int[arr1Sorted.length + arr2Sorted.length];

		boolean notSorted = true;
		int leftIndex = 0, rightIndex = 0;
		int sortedIndex = 0;
		
		while(notSorted) {		
			if(arr1Sorted[leftIndex] < arr2Sorted[rightIndex]) {
				sorted[sortedIndex] = arr1Sorted[leftIndex];
				leftIndex++;
			}
			else {
				sorted[sortedIndex] = arr2Sorted[rightIndex];
				rightIndex++;
			}
			
			sortedIndex++;
		}
		
		
//		for(int i = 0, k = 0; i < sorted.length && k < arr2Sorted.length; i+=2,k++) {
//			if(arr1Sorted[k] < arr2Sorted[k]) {
//				sorted[i] = arr1Sorted[k];
//				sorted[i+1] = arr2Sorted[k];
//			}
//			else {
//				sorted[i] = arr2Sorted[k];
//				sorted[i+1] = arr1Sorted[k];
//			}
//		}

		Utils.printArray(sorted);
		return sorted;

	}
}
