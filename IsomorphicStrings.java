import java.util.HashMap;
import java.util.Map;


public class IsomorphicStrings {
	 public static void main(String[] args) {
		 System.out.println( isIsomorphic2("foo","app") +":"+ isIsomorphic("foo","app"));
		 System.out.println( isIsomorphic2("xyz","bac") +":"+isIsomorphic("xyz","bac"));
		// System.out.println( isIsomorphic1("foo","app"));
		 System.out.println( isIsomorphic2("axy","boo")+":"+ isIsomorphic("axy","boo"));
		 System.out.println( isIsomorphic2("boo","axy")+":"+ isIsomorphic("boo","axy"));
		 
	 }
	 
	 public static boolean isIsomorphic(String str1,String str2){
		 Map<char[], char[]> charMap=new HashMap<char[], char[]>();
		 for(int i=0; i<str1.length();i++){
			 char c1=str1.charAt(i);
			 char c2=str2.charAt(i);
		
			 str2=str2.replaceAll(String.	valueOf(c2), String.valueOf(c1));
		 }
		 
		 return str1.equals(str2);
		 
	 }
	 
	 
	 public static boolean isIsomorphic1(String inputString1, String inputString2) {
	        int length1 = inputString1.length();
	        int length2 = inputString2.length();
	        if (length1 != length2) {
	            return false;
	        }
	        if (length1 == 1) {
	            return true;
	        }
	        Map<Character, Character> characterMap = new HashMap<Character, Character>();
	        for (int i = 0; i < length1; i++) {
	            if (!characterMap.containsKey(inputString1.charAt(i))) {
	                characterMap.put(inputString1.charAt(i), inputString2.charAt(i));
	            }
	            if (!characterMap.get(inputString1.charAt(i)).equals(inputString2.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 public static boolean isIsomorphic2(String str1, String str2) {
		 int n1 = str1.length();
		    int n2 = str2.length();
		    if(n1 != n2) {
		        return false;
		    }
		    
		    HashMap<Character, Character> map = new HashMap<Character, Character>();
		    HashMap<Character, Character> map2 = new HashMap<Character, Character>();
		    
		    boolean isIsomorphic=false;
		    for(int i = 0; i< n1; i++) {
		    	map2.put( str1.charAt(i), str1.charAt(i));
		        char ch = str2.charAt(i);
		        if(map.containsKey(ch)) {
		            char c = map.get(ch);
		            if (c != str1.charAt(i)){
		                return false;
		            }
		            isIsomorphic=true;
		        } else {
		            map.put(ch, str1.charAt(i));
		            if(n1==map.size() && map2.size()==map.size()){
		            	isIsomorphic=true;
		            }
		        }
		    }
		    return isIsomorphic;
		}

}
