import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Knapsack01 {

    public static void main(String[] args) {
       
        int[] weigths= {2,2,4,5};
   
        //	{1,3,4,5};
        int[] values = {2,4,6,9};
        	//{1,4,5,7};
        int capacity=8;
        Map<Map<Integer,Integer>,Integer> map=new LinkedHashMap<Map<Integer,Integer>,Integer>();
        StringBuffer sb = new StringBuffer() ;
        int maxVal=getItems(weigths, values,capacity,0,map,sb);
        System.out.println(maxVal);
       // System.out.println(sb);
       for(Map.Entry<Map<Integer,Integer>,Integer> e : map.entrySet()) {
    	   //for(Map<Integer,Integer> ie : e.getKey())
    	   Map<Integer,Integer> ie = e.getKey();
    	   for(Map.Entry<Integer,Integer> ie1: ie.entrySet()) {
    		   System.out.println(ie1.getKey() +" "+ie1.getValue()+" "+e.getValue());
    	   }
       }
    }

    private static int getItems(int[] weigths, int[] values, int remainingWeight,
            int currentWeightIndex, Map<Map<Integer, Integer>, Integer> map, StringBuffer buf) {
        if(currentWeightIndex >= weigths.length || remainingWeight<=0) {
            return 0;
        }
        Map current= new LinkedHashMap<Integer,Integer>();
        current.put(remainingWeight, weigths.length-currentWeightIndex);
       // current.put( weigths.length-currentWeightIndex,remainingWeight);
        if(map.containsKey(current))
            return map.get(current);
       
        //int maxvalue=0;
        if(remainingWeight < weigths[currentWeightIndex]) {
            return  getItems(weigths, values,remainingWeight,currentWeightIndex+1,map,buf );
        } else {
            int curentValueFromChoosingtheItem=values[currentWeightIndex] + getItems(weigths, values,remainingWeight-weigths[currentWeightIndex],currentWeightIndex+1,map,buf );
            int curentValueFromNotChoosingtheItem= getItems(weigths, values,remainingWeight,currentWeightIndex+1,map,buf );
            if(curentValueFromChoosingtheItem > curentValueFromNotChoosingtheItem){
                buf.append(values[currentWeightIndex]).append(",");
            }
            int maxvalue=Math.max(curentValueFromChoosingtheItem, curentValueFromNotChoosingtheItem);
            if(maxvalue >0)
                map.put(current, maxvalue);
            return maxvalue;
        }
       
       
    }

}




