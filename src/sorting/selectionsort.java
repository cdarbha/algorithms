package sorting;

public class selectionsort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,8,1,3,9,6};	
		
		for(int i = 0; i < arr.length; i++) {
			int minVal = i;
			
			for(int j = i; j < arr.length; j++) {
				if (arr[minVal] > arr[j])
					minVal = j;				
			}
			
			// swap 
			int s = arr[i];
			arr[i] = arr[minVal];
			arr[minVal] = s;
		}
		
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(String.format("%d,", arr[i]));
	}

}
