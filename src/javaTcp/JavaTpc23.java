package javaTcp;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class JavaTpc23 {

	public static void main(String[] args) {
		
		// 1. 다형성 인수
			Dog d = new Dog();
			display(d);
			
			Cat c = new Cat();
			display(c);
		
	}	// upcastiing

	// overloading 중 정의
	// 부모클래스의 매개변수를 받으면 한가지의 메서드를 받을 수 있음

	private static void display(Animal r) {	// 다형성 인수
		
		r.eat();
		//r.night();
		if(r instanceof Cat) {
			
			((Cat)r).night();	// downcasting
			
		}
			
	}
	
	
	/*
	private static void display(Cat c) {
				
	}

	private static void display(Dog d) {
				
	}
	*/
	

}
