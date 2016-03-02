import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Integer [] intArr = {1,2,5,10,20,50, 100};
		//int n = 250;
		List<Integer> l = new ArrayList<Integer>();
		int sum = 0 ;
		int count1 = 0;
		for(int i = 0 ; i< intArr.length ;i++){
			int count = N/intArr[i];
			int y=1;
			for(int j = 0 ; j<count;j++){
				l.add(intArr[i]);
				sum= sum+intArr[i];
				//int y=1;
				if(sum == N) {
					count1++;
					l.remove(l.size()-1);
					
					sum=sum-l.get((l.size()-1));
				} else if(sum > N){
					y++;
					while(sum >= N){
						
						if(sum == N) {
							count1++;
						} 
						sum = sum-l.get(l.size()-y);
						l.remove(l.size()-y);
						//y++;
						
					}
					//l.add(l.size()-y, l.size()-1);
					
				}
			}
		}
		System.out.print(count1);
		
	}

	private static void billCombination(List<Integer> numbers, int target, ArrayList<Integer> partial) {
		int s = 0;
	       for (int x: partial) s += x;
	       if (s == target)
	            System.out.println("sum("+Arrays.toString(partial.toArray())+")="+target);
	       if (s >= target)
	            return;
	       for(int i=0;i<numbers.size();i++) {
	             ArrayList<Integer> remaining = new ArrayList<Integer>();
	             int n = numbers.get(i);
	             for (int j=i+1; j<numbers.size();j++) remaining.add(numbers.get(j));
	             ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
	             partial_rec.add(n);
	             billCombination(remaining,target,partial_rec);
	       }
		
	}
	
	/*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] coins = {1,2,5,10,20,50, 100}; 
        final int n = coins.length;
        int cycle = 0;
        for (int c : coins)
            if (c <= N && c >= cycle)
                cycle = c + 1;
        cycle *= n;
        BigInteger[] table = new BigInteger[cycle];
        Arrays.fill(table, 0, n, BigInteger.ONE);
        Arrays.fill(table, n, cycle, BigInteger.ZERO);
 
        int pos = n;
        for (int s = 1; s <= N; s++) {
            for (int i = 0; i < n; i++) {
                if (i == 0 && pos >= cycle)
                    pos = 0;
                if (coins[i] <= s) {
                    final int q = pos - (coins[i] * n);
                    table[pos] = (q >= 0) ? table[q] : table[q + cycle];
                }
                if (i != 0)
                    table[pos] = table[pos].add(table[pos - 1]);
                pos++;
            }
        }
 
        System.out.print( table[pos - 1];
    }*/

}
