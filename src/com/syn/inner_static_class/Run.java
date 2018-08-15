package com.syn.inner_static_class;

import com.syn.inner_static_class.PublicClass.PrivateClass;

public class Run {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
		
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
	}
}
