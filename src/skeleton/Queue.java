package skeleton;

import java.util.NoSuchElementException;

public abstract class Queue {
	protected Node first;
	protected Node last;
	
	public Queue() {
		first = last = null;
	}
	
	/**
	 * Adds a person to the end of the list.
	 * 
	 * @param p Person to insert
	 */
	public abstract void add(Person p);
	/**
	 * Returns the first element of the queue and deletes it.
	 * 
	 * @return The first person in the queue.
	 * @throws NoSuchElementException if the list is empty.
	 */
	public abstract Person retrieve() throws NoSuchElementException;
	/**
	 * The size is the number of nodes in the queue.
	 * 
	 * @return the size of the queue.
	 */
	public abstract int size();
	/**
	 * Emptiethes the list.
	 */
	public abstract void clear();
	
	
	public static class Node {
		public Person person;
		public Node next;
		
		public Node(Person person) {
			this.person = person;
		}
	}
}
