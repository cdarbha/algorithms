package sorting;

import org.apache.commons.lang3.ArrayUtils;

import utils.Utils;

public class mergesort {

	public static void main(String[] args) {
		int[] arr = new int[] {9,5,-70,3,80,4,6,1,2, 100,50,75, 32, 45, 56};

		Utils.printArray(sort(arr));
	}

	private static int[] sort(int[] arr) {
		if(arr.length == 1)
			return arr;
		
		int splitIndex = arr.length/2;
		
		int[] left = ArrayUtils.subarray(arr, 0, splitIndex);
		int[] right = ArrayUtils.subarray(arr, splitIndex, arr.length);
		
		int[] sortedLeft = sort(left);
		int[] sortedRight = sort(right);
		
		return merge(sortedLeft, sortedRight);		
	}
	
	private static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int leftIndex = 0, rightIndex = 0;
		
		for(int i = 0; i < merged.length; i++) {
			if(leftIndex >= left.length && rightIndex >= right.length)
				break;
			else if(leftIndex >= left.length) {
				merged[i] = right[rightIndex];
				rightIndex++;
				continue;
			}
			else if (rightIndex >= right.length) {
				merged[i] = left[leftIndex];
				leftIndex++;
				continue;
			}
			
			
			if(left[leftIndex] <= right[rightIndex]) {
				merged[i] = left[leftIndex];
				leftIndex++;
			}
			else {
				merged[i] = right[rightIndex];	
				rightIndex++;
			}
			
		}
		
		return merged;
	}
	
}
