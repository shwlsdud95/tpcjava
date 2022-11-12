package javaTcp;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class JavaTpc20 {

	public static void main(String[] args) {
	// animal 부모클래스를 사용하지 않음
	//	Animal d = new Dog();
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
	// Dog.classm Cat.class  다른 사람에게 자바가 아닌 클래스 파일 형식으로 받았을 때 
		
		Animal ani = new Dog();	// upcasting (자동 형변환)
		ani.eat();// ? --> 개처럼 먹다 
	
		ani = new Cat();
		ani.eat();// ? --> 고양이 처럼 먹다 
	//	ani.night();	//부모클래스에서 없고 자식 클래스에서만 메소드가 있을시 강제 낮춤
		((Cat)ani).night(); // 밤에 눈에서 빛이난다. --> downcasting(강제형변환)
				
		
		
	}

}
