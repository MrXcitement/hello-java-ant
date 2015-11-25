package com.codenvy.examples.ant;

public class Main {
    public static void main(String[] args) {
    	Person manny = new Person("Manny");
    	Person moe = new Person("Moe");
    	Person jack = new Person("Jack");
    	
    	Greeter g = new Greeter(manny);
    	System.out.println(g.hi(moe));
    	System.out.println(g.hi(jack));
    	System.out.println(g.bye(jack));
    	System.out.println(g.bye(moe));
        
    }
}
