package com.sixpines.example.hello;

public class Main {
    public static void main(String[] args) {
    	Person manny = new Person("Manny");
    	Person moe = new Person("Moe");
    	Person jack = new Person("Jack");
    	
    	Greeter g = new Greeter(manny);
    	System.out.println(g.sayHi(moe));
    	System.out.println(g.sayHi(jack));
    	System.out.println(g.sayBye(jack));
    	System.out.println(g.sayBye(moe));
        
    }
}
