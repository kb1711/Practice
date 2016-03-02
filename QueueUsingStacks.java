
public class QueueUsingStacks {
static StackArray stack1= new StackArray();
static StackArray stack2= new StackArray();

public static void enqueue(int i) {
	stack1.push(i);
}

public static int dequeue(){
	if(isEmpty())
		return Integer.MIN_VALUE;
	if(stack2.isEmpty() && !stack1.isEmpty()){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		
	}
	return stack2.pop();
}
public static boolean isEmpty() {
	return stack2.isEmpty() && stack1.isEmpty();
}
public static void main(String[] args) {
	for(int i =34 ;i>0; i=i-2){
		enqueue(i);
	}
	System.out.println("Pop1 result: "+dequeue());
	System.out.println("Pop2 result: "+dequeue());
}
}
