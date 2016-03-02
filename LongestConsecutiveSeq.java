import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class LongestConsecutiveSeq {

	public static void main(String[] args) {
		String str="thiiiis iss a teeest seeentennncccce";
		char c=longestConsequtiveSeq(str);
		System.out.println(c);
		
	}

	private static char longestConsequtiveSeq(String str) {
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		char currentChar='\0';
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			while(c==currentChar){
				i++;
				c=str.charAt(i);
				count=count+1;
				continue;
				
			}
			 if(charMap.get(c) !=null  ) {
					int countfromPrevIter=charMap.get(c);
					count=Math.max(countfromPrevIter, count);
			 }
			 currentChar=c;

		
		charMap.put(c, count+1);
		count=0;
			
		}
		Iterator it =charMap.entrySet().iterator();
		int maxCount=0;
		char charHavingMaxOccurances='\0';
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			int charCount=(int)pair.getValue();
			if(charCount>maxCount){
				maxCount=charCount;
				charHavingMaxOccurances=(char)pair.getKey();
			}
		}
		return charHavingMaxOccurances;
	}

}
