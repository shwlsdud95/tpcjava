package javaTcp;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class JavaTpc25 {

	public static void main(String[] args) {

		//Animal ani = new Animal();	--> 동물 클래스가 추상 클래스이기 때문에 독자적으로는 생성 x 
		
		// eat() -- 재정의(overide) -----> eat() 
		
		Animal ani = new Dog();
		
		ani.eat();  // {?} --> {개}
					// 개 클래스의 메소드를 재정의를 하지 않으면 다형성이 성사되지 않음 
		ani.move();
		
		ani = new Cat();
		ani.eat(); // {?} --> {고양이}
		ani.move();
		((Cat)ani).night();
		
		
	}

}
