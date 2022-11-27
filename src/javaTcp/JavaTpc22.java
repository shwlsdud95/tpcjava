package javaTcp;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class JavaTpc22 {

	public static void main(String[] args) {
		
		
		// 이클래스는 리모콘 역할부모 클래스의 메서드로 재정의된
		// 공동 메서드 출력
		
		// upcasting
		// Cat ani = new Cat();	부모를 전혀 사용하지 않는 경우
		// Object ani = new Cat();
		Animal ani = new Cat();
		ani.eat();  //컴파일 시점 -> Animal, 실행시점 ->Cat
		
		//ani.night();
		//Cat c = (Cat)ani;
		//c.night();
		((Cat)ani).night();	// . 이 우선시 인식되므로 . 전까지 괄호로 우선 인식시켜줘야함 
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 객체지향 원리
		
		Object o = new Dog();
		((Dog)o).eat();
		
		
	}

}
