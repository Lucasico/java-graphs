
public class Queue<T> {
	public Node<T> begin;
	public Node<T> end;

	public Queue() {
		begin = null;
		end = null;
	}

	public void enqueue(Node<T> newNode) {
		if (begin == null) {
			begin = newNode;
			end = newNode;
		} else {
			end.next = newNode;
			end = newNode;
		}

	}

	public Node<T> dequeue() {
		Node<T> tmp = this.begin;
		if (tmp != null)
			this.begin = this.begin.next;
		return tmp;

	}
	
	public boolean isEmpty() {
		return this.begin == null;
	}
}
