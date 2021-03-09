package com.vijay.test1;

public class TestAccessInsideSamePackage {
	public static void main(String args[]) {
		AccesModifiersDemo obj = new AccesModifiersDemo();
		obj.age = 20;
//		obj.marks = 90; -- > Cannot be done because it is private modifier cannot be used in different class even of same package
	}
}
