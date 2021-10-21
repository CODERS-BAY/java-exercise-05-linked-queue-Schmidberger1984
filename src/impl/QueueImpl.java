package impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import skeleton.Person;
import skeleton.Queue;

public class QueueImpl extends Queue {

	public static int size = 0;

	public QueueImpl() {
		super();
	}

	@Override
	public void add(Person p) {
		Node newNode = new Node(p);

		if (size == 0) {
			first = newNode;
			last = first;
		} else {
			last.next = newNode;
			last = last.next;
		}
		size++;
	}

	@Override
	public Person retrieve() throws NoSuchElementException {
		if (size <= 0) {
			throw new NoSuchElementException();
		}

		Node retrieve = first;
		first = first.next;
		size--;

		if (first == null) {
			last = null;
			size = 0;
		}

		return retrieve.person;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		/*
		 * Comment from the Java implementation of clear() from the LinkedList
		 * 
		 * Clearing all of the links between nodes is "unnecessary", but: - helps a
		 * generational GC if the discarded nodes inhabit more than one generation - is
		 * sure to free memory even if there is a reachable Iterator
		 */

		if (size > 1) {
			Node current = first;
			while (first != null) {
				current = current.next;
				current.person = null;
				first = current.next;
			}
		}
		first = last = null;
		size = 0;
	}

	/**
	 * Iterator mostly used for printing in this exercise.
	 * 
	 * @return new Person iterator.
	 */
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {

			Node current = first;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Person next() {
				if (current == null) {
					throw new NoSuchElementException();
				}

				Person p = current.person;
				current = current.next;

				return p;
			}

		};
	}

	// This method is already implemented.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Person> it = iterator();

		while (it.hasNext()) {
			sb.append(it.next());
			sb.append(" -> ");
		}
		return sb.length() > 3 ? sb.substring(0, sb.length() - 3) : "empty list";
	}
}