
public class ContineousSum {
/*

	 Question: Given a sequence of positive integers A and an integer T, return whether there is a continuous sequence of A that sums up to exactly T
	 Example
	 [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
	 [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
	 [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7*/
	
	public static void main(String[] args) {
		int[] arr={23, 5, 4, 7, 2, 11};
		int i=20;
		/*int[] arr={1, 3, 5, 23, 2};
		int i=8;*/
		System.out.println(ContineousSum(arr,i));
	}

	private static boolean ContineousSum(int[] arr, int sumValue) {
		int sum=0;
		int lowIndex=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>sumValue){
				lowIndex=i+1;
				sum=0;
				continue;
			}
			sum+=arr[i];
				while(sum >sumValue) {
				sum-=arr[lowIndex];
				lowIndex++;
				}if(sum == sumValue){
					return true;
				}
				
				else if(sum < sumValue){
				lowIndex=lowIndex==-1?i:lowIndex;
				
				} 
				
		}
		return false;
	}
}
