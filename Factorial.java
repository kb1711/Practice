
public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(19));
	}
static long fact (int n){
	if(n<=1)
		return 1;
	long result = n*fact(n-1);
	
	return result;
}
}
