import java.util.ArrayList;
import java.util.List;


public class StackArrayGeneric<T> {
	private  List<T> stack;
	


	StackArrayGeneric(){
		stack=new ArrayList<T>();;
	}
	public  void push(T i){
		stack.add(i);
	}
	public  T pop(){
		if(isEmpty()){
			return null;
		} 
		
		return stack.remove(stack.size()-1);
		
	}
	
	public  T peek(){
		if(isEmpty()){
			return null;
		} 
		
		return stack.get(stack.size()-1);
		
	}
	public  boolean isEmpty() {
		return stack.size()==0;
	}


}
