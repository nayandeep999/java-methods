package com.kodewala.strings;

final class PersonAA {

}

//class PersonB extends PersonAA { // Cannot extend final class
//	
//}

class PersonBB {
	final void sysoutt() {
		System.out.println("PersonBB: sysoutt()");
	}
}

class PersonCC extends PersonBB {
//	void sysoutt() { //Cannot override final method
//		
//	}
}

public class FInalClassExtend {

}
