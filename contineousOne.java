
public class contineousOne {
	public static void main(String[] args) {
		int[] arr={1,1,0,0,1,1,1,0,0,1};
		int k=3;
		/*int[] arr={1, 3, 5, 23, 2};
		int i=8;*/
		System.out.println(ContineousOnes(arr,k,0,0,3,0));
	}

	private static int ContineousOnes(int[] arr, int k,int index, int maxCount,int initialK, int maxFoundTillNow) {
		if(arr[index]==1) {
			maxCount++;
		}
		if(arr[index]==0 && k < 0){
			maxCount++;
			k--;
		}
		if(k<0 ) {
			k=initialK;
			return maxCount;
		}
		if(k>=0 ) 
		index++;
		if(maxCount > maxFoundTillNow)
			maxFoundTillNow = maxCount;
		return ContineousOnes(arr,k,index,maxCount,initialK,maxFoundTillNow);
		
	}
}
