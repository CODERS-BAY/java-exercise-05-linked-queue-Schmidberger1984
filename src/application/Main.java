package application;


import javax.management.Query;

import impl.Employee;
import impl.QueueImpl;
import skeleton.Person;
import skeleton.Queue;

public class Main {

	public static void main(String[] args) {
	Queue q =new QueueImpl();
	q.add(new Employee("hans", "null","sdf","34"));
	q.add(new Employee("er", "sdf","sdf","34"));
	System.out.println(q);
	System.out.println(q.retrieve());
	q.clear();
	//letzter Punkt muss fehlschlagen, da die liste gelöscht worden ist
	System.out.println(q);
	}

}
