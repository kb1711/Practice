
public class ReverseDoublyLinkedList {
	public static void main(String[] args) {
		DoublyListNode DoublyListNode1= new DoublyListNode(1,null,null);
		DoublyListNode DoublyListNode2= new DoublyListNode(2,null,null);
		DoublyListNode DoublyListNode3= new DoublyListNode(3,null,null);
		DoublyListNode1.setNext(DoublyListNode2);
		DoublyListNode2.setPrev(DoublyListNode1);
		
		DoublyListNode2.setNext(DoublyListNode3);
		DoublyListNode3.setPrev(DoublyListNode2);
		/*while(DoublyListNode1!=null){
			System.out.println(DoublyListNode1.getData());
			DoublyListNode1=DoublyListNode1.getNext();
		}*/
		
		reverseDoublyLinkedList(DoublyListNode1);
	}

	private static void reverseDoublyLinkedList(DoublyListNode doublyListNode) {
		DoublyListNode tail =null;
		DoublyListNode dummyHead= new DoublyListNode(0,null,null);
		DoublyListNode current=dummyHead;

		while(doublyListNode.getNext()!=null){
			tail=doublyListNode.getNext();
			doublyListNode=doublyListNode.getNext();

		}
		while(tail !=null){
			current.setNext(tail);
			tail.setNext(tail.getPrev());
			
			tail.setPrev(current.getNext());

			tail = tail.getNext();
			
		}
		while(dummyHead.getNext()!=null){
			System.out.println(dummyHead.getData());
			dummyHead=dummyHead.getNext();
		}
	}

		
}
