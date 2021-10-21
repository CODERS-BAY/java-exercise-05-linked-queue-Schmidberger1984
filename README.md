# Linked Queue Implementation

You have three different tasks in this exercise. Main goal is to implement a queue based on a linked list implementation.

~~~
| Value |    | Value |           
|  ---  |    |  ---  |           
|  next-|--> |  next-|--> NULL           
  ~~~
  
  The values are represented by an `employee` inherited from a person.
  
  # 1 Design the Employee
  Decide which properties are already in the person class and model them accordingly.
  The Employee is more specific and must have at least the following fields.
  
  * An unique ID
  * Department
  * Short jobs description eg. `Accounting Manager`
  
Sketch a rough version of the class and don't forget that the objects are to be printed.

# 2 Implement the Linked Queue
Implemented the missing parts in the `impl` package. 
A description is written in `JavaDoc`.

# 3 Testing
Consider possible test scenarios for your implementation.
Write a short textual testing plan. You do not need to write unit tests (yet).

---

## Helpful ressources
In Java there exsits the `UUID` class which is capable of generating random IDs. Look for an example below.

~~~Java
UUID ID = UUID.randomUUID();
~~~
The `UUID` has an implemented `toString()` method.
