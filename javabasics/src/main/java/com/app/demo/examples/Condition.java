package com.app.demo.examples;

public class Condition {
	
	public boolean isOlderThan(Person person, int targetAge) {
		boolean flag = false;
		if(person != null) {
			flag = person.getAge() > targetAge;
			System.out.println("persons age="+person.getAge());
			System.out.println("targetAge ="+targetAge);
		}
		return flag;
	}
}
