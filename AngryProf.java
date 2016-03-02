import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProf {

    public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	/* if(args.length>=4){
    	        int test=Integer.parseInt(args[0]);
    	    	int testCount=0;
    	        int i=1;
    	        while(i<args.length && testCount<test && test<=10){
    	        	int studentsArrivedOntime=0;
    	        	int input=Integer.parseInt(args[i]);
    	            int noOfstudentsbeforecancellation=Integer.parseInt(args[i+1]);
    	            if(input>1000 || noOfstudentsbeforecancellation>input)
    	                break;
    	        	for(int k=i+2;k<i+2+input;k++) {
    	            if(Integer.parseInt(args[k])<=0){
    	                studentsArrivedOntime++;
    	            }
    	           
    	        	}
    	        i=i+2+input;
    	        if(studentsArrivedOntime>=noOfstudentsbeforecancellation)
    	            System.out.println("NO");
    	        else
    	            System.out.println("YES");
    	        }
    	        testCount++;
    	        */
    	
    	 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
         //System.out.print();

	      int test=s.nextInt();
	    	int testCount=0;
	        int i=0;
	        while(s.hasNextInt() && testCount<test && test<=10){
	        	int studentsArrivedOntime=0;
                int counter=0;
	        	int input=s.nextInt();
	            int noOfstudentsbeforecancellation=s.nextInt();
	            if(input>1000 || noOfstudentsbeforecancellation>input)
	                break;
	        	while(s.hasNextInt() && counter<input) {
	            if(s.nextInt()<=0){
	                studentsArrivedOntime++;
	            }
	               counter++;
	        	}

	            if(studentsArrivedOntime>=noOfstudentsbeforecancellation)
	                System.out.print("NO");
	           else
	               System.out.println("YES");
	        }
	        
	    }
    	        
    	    }
    

