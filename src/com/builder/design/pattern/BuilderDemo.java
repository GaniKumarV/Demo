package com.builder.design.pattern;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		
		//Phone phone = new Phone(101, "andriod", "fsdf", 3);
		
		Phone builder =new PhoneBuilder().setPid(10).getPhone();
		
		
		System.out.println(builder);
	}

}
