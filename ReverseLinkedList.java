

public class ReverseLinkedList {
	
	 public static void main(String[] args) {
		Node l1 = new Node(1, null);
	    Node l2 = new Node(2, null);
	    l1.setNext(l2);
	    Node l3 = new Node(3, null);
	    l2.setNext(l3);
		reverseLinkedList(l1);
	}

	private static void reverseLinkedList(Node head) {
		Node current=null;
		Node prev=null;
		while(head!=null){
			current=head;
			head=head.getNext();
			current.setNext(prev);
			prev=current;
			
		}
		while(current!=null){
			System.out.println(current.getData());
			current=current.getNext();
		}
	}


}
