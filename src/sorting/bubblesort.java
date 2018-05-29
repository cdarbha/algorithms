package sorting;

public class bubblesort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,8,1,3,9,6};

		int n = arr.length;
		
		while(n > 1) {
			
			for(int i = 0; i < n-1 ; i++) {
				if(arr[i] > arr[i+1]) {
					int s = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = s;					
				}
			}
			
			n--;
		}
		
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(String.format("%d,", arr[i]));
		
	}
}
