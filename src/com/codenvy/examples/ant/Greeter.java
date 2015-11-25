package com.codenvy.examples.ant;

public class Greeter extends Person {
	public Greeter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Greeter(Person p) {
		super(p.name);
	}
	public String sayHi(Person p) {
		return name + " says: Hello, " + p.name;
	}
	public String sayBye(Person p) {
		return name + " says: Goodbye, " + p.name;
	}
}
