package com.vijay.test2;

import com.vijay.test1.AccesModifiersDemo;

public class DiiferentClassAccessCheck {
	public static void main(String args[]) {
		AccesModifiersDemo obj = new AccesModifiersDemo();
//		obj.data = 20; -- > cannot be done because data is package private.
		obj.value = 30;
	}
}
