package sorting;

public class insertionsort2 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,5,-70,3,80,4,6,1,2, 100,50,75, 32, 45, 56, 12};
		
		for(int sortIndex = 1; sortIndex < arr.length; sortIndex++) {
			int sortIndexValue = arr[sortIndex];
			
			for(int j = sortIndex; j > 0; j--) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
				else
					break;
				
//				for(int c = 0;c < arr.length; c++)	{
//					System.out.print(arr[c]+",");				
//				}
//				System.out.print("\n");
			}
			
		}
		

		for(int j = 0;j < arr.length; j++)	{
			System.out.print(arr[j]+",");				
		}
		System.out.print("\n");
		
	}

}
