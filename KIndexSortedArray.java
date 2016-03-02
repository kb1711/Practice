
public class KIndexSortedArray {

	public static void main(String[] args) {
		//int[] anArray ={1,3,3,5,5,5,5,6,7,8,9,9,10,11};
		//int[] anArray ={5,5,5,5,5,5,5,5};
		int[] anArray ={1};
		int i=1;
		int index=getKIndex(anArray,i);
		System.out.println("Index is "+ index);
		
	
	}
	
	private static int getKIndex(int[] a, int keyToBeFound) {
		int index = -1;
		int lowIndex = 0;
		int highIndex = a.length - 1;
		while (lowIndex < highIndex) {
			int midIndex = lowIndex + ((highIndex - lowIndex) / 2);

			if (keyToBeFound < a[midIndex]) {
				highIndex=midIndex;
			} else if (keyToBeFound > a[midIndex]) {
				lowIndex=midIndex+1;
			} else {
				index=midIndex;
				highIndex=midIndex;
				--midIndex;
				continue;
			}
		}
		return index;
	}

	
	
}
