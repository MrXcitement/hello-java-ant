package com.codenvy.examples.ant;

public class Greeter extends Person {
	public Greeter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Greeter(Person p) {
		super(p._name);
	}
	public String hi(Person p) {
		return "Hello, " + p._name;
	}
	public String bye(Person p) {
		return "Goodbye, " + p._name;
	}
}
