
public class StackLinkedList {
	private static Node stackTail;
	public static void main(String[] args) {
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
		
	}
public StackLinkedList() {
	
}
	private static int peek() {
		return stackTail.getData();
	}

	private static int pop() {
		Node temp =stackTail;
		stackTail=stackTail.getNext();
		return temp.getData();
	}

	private static void push(int i) {
		Node stackNode= new Node(i,stackTail);
		stackTail=stackNode;
	}
}
