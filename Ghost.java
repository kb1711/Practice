	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class Ghost {
 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int A = in.nextInt();
	        int B = in.nextInt();
	        int C = in.nextInt();
	        int D = in.nextInt();
	        int gostCount = 0;
	        for(int i = 1 ; i <=A ; i++) {
	            for (int j =1 ; j <=B ; j++) {
	                if((i-j) % 3 == 0) {
	                    for(int k =1 ; k <=C; k++) {
	                        if((j + k)%5 == 0 && (i*k) %4 == 0)  {
	                            for(int l=1 ;l<=D ;l++) {
	                                if(isPrime(i) && isPrime(l) ){
	                                    gostCount++;
	                                    System.out.print(i +" ");
	                                    System.out.print(j +" ");
	                                    System.out.print(k +" ");
	                                    System.out.print(l +"\n");
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        System.out.print(gostCount);
	    }
	    static boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	        return true;
	    }

	}


