package peakfinder;

import java.util.Random;

public class peakfinder {
	
//	private static int findPeak(int[] arr, int low, int high, int n) {
//		
//	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int rand = r.nextInt();
		
		int[] arr = new int[rand];
		
		for(int i = 0 ; i < rand; i++) {
			arr[i] = r.nextInt();
		}
		
		// Find peak
		int pp = arr.length/2;
		
		if(arr[pp - 1] > arr[pp]) {
			pp = pp -1;
			
			// navigate left
			while(pp >= 0) {
				if(arr[pp - 1] <= arr[pp])
					System.out.println("Peak found at index " + pp + " values = {" + arr[pp-1]+","+arr[pp]+","+arr[pp+1]);
				else
					pp = pp-1;
			}
		}
		else if(arr[pp] < arr[pp + 1]) {
			// navigate right
			
			pp = pp+1;
			
			while(pp <= arr.length-1) {
				if(arr[pp] >= arr[pp+1])
					System.out.println("Peak found at index " + pp + " values = {" + arr[pp-1]+","+arr[pp]+","+arr[pp+1]);
				else
					pp = pp +1;					
			}			
		}
		else {
			System.out.println("Peak found at index " + pp + " values = {" + arr[pp-1]+","+arr[pp]+","+arr[pp+1]);
		}
		
		
	}

}
