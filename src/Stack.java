
public class Stack<T> {
	public Node<T> top;

	public Stack() {
		this.top = null;
	}

	public void push(Node<T> newNode) {
		newNode.next = this.top;
		this.top = newNode;

	}

	public Node<T> pop() {
		Node<T> tmp = this.top;
		if (tmp != null)
			this.top = this.top.next;
		return tmp;

	}
	
	public boolean isEmpty() {
		return this.top == null;
	}

}
