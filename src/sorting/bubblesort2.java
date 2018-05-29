package sorting;

public class bubblesort2 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,5,-70,3,80,4,6,1,2};
		
		int len = arr.length;
		
		for(int i = 0; i < len-1; i++) {
			for(int j = 0; j < len-i-1; j++){
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}		
			
		}
		
		for(int j = 0;j < len; j++)	{
			System.out.print(arr[j]+",");				
		}
		System.out.print("\n");
//		
	}
	
	private static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

}
