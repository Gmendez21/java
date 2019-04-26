package com.class26;

public class Bank {
	
	public int getBalance() {

		return 0;
	
	}
	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.getBalance());
		B obj1 = new B();
		System.out.println(obj1.getBalance());
		C obj2 = new C();
		System.out.println(obj2.getBalance());
		
	
	}

	}


class A extends Bank {
	public int getBalance() {
		
		return 1000;
	}

}

class B extends Bank {
	public int getBalance() {
		
		return 1500;
	}

}

class C extends Bank {
	public int getBalance() {
		
		return 2000;
	}

}




