
public class MergeSort {
		  private static int[] numbers;
		  private static int[] helper;

		  private int number;

		 /* public void sort(int[] values) {
		    this.numbers = values;
		    number = values.length;
		    this.helper = new int[number];
		    mergesort(0, number - 1);
		  }
*/
		  private static void mergesort(int low, int high) {
		    // check if low is smaller then high, if not then the array is sorted
		    if (low < high) {
		      // Get the index of the element which is in the middle
		      int middle = low + (high - low) / 2;
		      // Sort the left side of the array
		      mergesort(low, middle);
		      // Sort the right side of the array
		      mergesort(middle + 1, high);
		      // Combine them both
		      merge(low, middle, high);
		    }
		  }

		  private static void merge(int low, int middle, int high) {

		    // Copy both parts into the helper array
		    	helper=new int[high+1];

		    for (int i = low; i < high; i++) {
		      helper[i] = numbers[i];
		    }

		    int i = low;
		    int j = middle + 1;
		    int k = low;
		    // Copy the smallest values from either the left or the right side back
		    // to the original array
		    while (i <= middle && j <= high) {
		      if (helper[i] <= helper[j]) {
		        numbers[k] = helper[i];
		        i++;
		      } else {
		        numbers[k] = helper[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    while (i <= middle) {
		      numbers[k] = helper[i];
		      k++;
		      i++;
		    }

		  }
			public static void main(String[] args) {
				String[]s=args[0].split(",");
				numbers=new int[s.length];

				for(int str=0;str < s.length;str++){
					numbers[str]=		Integer.parseInt(s[str]);
				}
				mergesort(0,numbers.length);
			}
		} 







