package sorting;

public class insertionsort {
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,8,1,3,9,6};
		
		for(int i = 1; i < arr.length; i++) {
			
			for(int j = i; j >= 1; j--) {
				if(arr[j] >= arr[j-1])
					break;
				else {
					int s = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = s;					
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(String.format("%d,", arr[i]));
	}

}
