package impl;

import java.util.UUID;

import skeleton.Person;

public class Employee extends Person{
String description;
String department;
UUID id;

	public Employee(String firstname, String lastname, String description, String department) {
		super(firstname, lastname);
		this.description=description;
		this.department=department;
	}
	public void creatId() {	
	id=UUID.randomUUID();
	}
	@Override
	public String toString() {
		return "Employee [description=" + description + ", department=" + department + ", id=" + id + ", firstname="
				+ firstname + ", lastname=" + lastname + "]";
	}
}
//test