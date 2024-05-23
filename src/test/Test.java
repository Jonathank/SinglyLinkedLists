package test;

public class Test {
	public static void main(String[] args) {
		SinglyLinkedList<String>mylist = new SinglyLinkedList<>();
		String cow = "cow";
		String cat = "cat";
		String pig = "rabbit";
		
		System.out.println("first element: "+ mylist.firstelement());
		System.out.println("last element: "+ mylist.lastElement());
		mylist.addFirst(cow);
		System.out.println("first element: "+ mylist.firstelement());
		System.out.println("last element: "+ mylist.lastElement());
		mylist.addFirst(cat);
		System.out.println("first element: "+ mylist.firstelement());
		System.out.println("last element: "+ mylist.lastElement());
		mylist.addLast(pig);
		System.out.println("first element: "+ mylist.firstelement());
		System.out.println("last element: "+ mylist.lastElement());
		System.out.println("Removed element : "+ mylist.removeFirst());
		System.out.println("first element: "+ mylist.firstelement());
		System.out.println("last element: "+ mylist.lastElement());
	}
	

}
