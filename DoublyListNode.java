

public class DoublyListNode {

	  // @exclude

	  DoublyListNode(int data, DoublyListNode prev, DoublyListNode next) {
	    this.data = data;
	    this.prev = prev;
	    this.next = next;
	  }
		 public int getData() {
				return data;
			}

			public void setData(int data) {
				this.data = data;
			}

			public DoublyListNode getPrev() {
				return prev;
			}

			public void setPrev(DoublyListNode prev) {
				this.prev = prev;
			}

			public DoublyListNode getNext() {
				return next;
			}

			public void setNext(DoublyListNode next) {
				this.next = next;
			}

			public int data;
			  public DoublyListNode prev, next;
}
