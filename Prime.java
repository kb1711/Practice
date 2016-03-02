
public class Prime {
	public static void main(String[] args) {
		System.out.println(primeCount(87109));
	}
	
	public static int primeCount(int n) {
	int count=0;
	
    for(int i=2;2*i<n;i++) {
        if(n%i!=0){
            count++;
        }
    }
    return count;
	}
}
