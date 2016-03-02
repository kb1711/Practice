import java.util.Arrays;


public class StackArray {
	private  int[] stack=new int[15];;
	//index of top element
	private  int top;
/*	public static void main(String[] args) {
		for(int i =0 ;i<35; i=i+2){
			push(i);
		}
		System.out.println("Pop1 result: "+pop());
		System.out.println("Pop2 result: "+pop());
		System.out.println("Pop3 result: "+pop());
		System.out.println("Peek result: "+peek());
		System.out.println("Pop4 result: "+pop());
		for(int i =40 ;i<47; i=i+2){
			push(i);
		}
		
	}*/

	StackArray(){
		stack=new int[10];
		top=-1;
	}
	public  void push(int i){
		if(top==stack.length-1)
		stack=	extendArray(stack);
		stack[++top]=i;
		//top++;
	}
	public  int pop(){
		if(isEmpty()){
			return -1;
		} 
		
		int popedItem=stack[top];
		top--;
		return popedItem;
	}
	
	public  int peek(){
		if(isEmpty()){
			return -1;
		} 
		return stack[top-1];
		
	}
	public  boolean isEmpty() {
		return top==-1;
	}
	private  int[] extendArray(int[] stack) {
		return Arrays.copyOf(stack, 2*stack.length);		
	}

}
