package test;

/**
 * @author JONATHAN
 ***/
@SuppressWarnings("hiding")
public class SinglyLinkedList <E>{
	
private static class Node<E>{
	private E element;
	private Node<E>next;
	
	public Node(E e, Node<E>n){
		this.element = e;
		this.next = n;
	}
	
	public E getElement() {
		return element;
	}
	public Node<E>getNext(){
		return next;
	}
	public void setNext(Node<E>n) {
		next = n;
	}
}//end of inner node class

	private Node<E>head = null;
	private Node<E>tail = null;
	private int size = 0;
	
	public boolean isEmpty() {
	return	size == 0;
	}
	public int size() {
		return size;
	}
	
	//return first element in the list
	public E firstelement() {
		if(isEmpty())
			return null;
		return head.getElement();
	}
	//return last element
	public E lastElement() {
		if(size==0)
			return null;
		return tail.getElement();
	}
	
	//add element to the front of list
	public void addFirst(E newest) {
		
		Node<E>newnode = new Node<>(newest,head);
		if(isEmpty())
			head = tail=newnode;
		newnode.setNext(head);
		head = newnode;
		size++;
		
	}
	
	//add to last of list
	public void addLast(E newest) {
		
		Node<E>newnode = new Node<>(newest,null);
		if(isEmpty())
			tail=head=newnode;
		newnode.setNext(null);
		tail.setNext(newnode);
		tail = newnode;
		size++;
	}
	
	//remove first element
	public E removeFirst() {
		if(isEmpty()) {
			tail=null;
		}
		E removed = head.getElement();
		head = head.getNext();
		size--;
		return removed;
		
	}

}
