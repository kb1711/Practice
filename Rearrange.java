
public class Rearrange {

	public static void main(String[] args) {
		int[] anArray ={1,3,7,4,9,2,0, 8};
		int i=3;
		rearrange(anArray,i);

	}

	private static void rearrange(int[] anArray, int index) {
		int lowIndex = 0;
		int highIndex = anArray.length - 1; 
		int searchVal=anArray[index];
		while (lowIndex <= highIndex) {
			if(anArray[lowIndex] < searchVal){
				lowIndex++;
			} else if(anArray[highIndex] > searchVal){
				highIndex--;
			} else {
				swap(anArray,lowIndex,highIndex);
				lowIndex++;
				//highIndex--;
				//if(anArray[lowIndex] != anArray[index]) lowIndex++;
				//if(anArray[highIndex] != anArray[index]) highIndex--;
			}
		}
		for(int i=0;i<anArray.length;i++)
			System.out.println(anArray[i]);
		
	}

	private static void swap(int[] a, int lowIndex, int highIndex) {
		int temp = a[lowIndex];
		a[lowIndex]=a[highIndex];
		a[highIndex]=temp;
		
	}

}
