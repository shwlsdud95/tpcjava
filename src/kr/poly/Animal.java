package kr.poly;

public abstract class Animal {	// 추상클래스(불완전한 객체) 	// Animal ani = new Animal(); x 
	// 스스로의 객체를 사용하지는 못하지만 부모로서의 메서드는 사용 가능 

	// Dog, Cat --> eat()
	
	// 추상메서드(불완전한 메서드) 
	public abstract void eat();  /*{
		
		System.out.println("?");	// 포괄적, 추상적 

	}*/
	
	public void move() {
		System.out.println("무리를 지어서 이동한다.");
		
	}
	
	
}
