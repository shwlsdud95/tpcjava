package javaTcp;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class JavaTpc19 {

	public static void main(String[] args) {
		// dog, cat --> animal
		
		Dog d = new Dog();
		
		d.eat();
		
		Cat c = new Cat();
		
		c.eat();
		
		
		// Dog.java(x), Dog.class(o)

		// Dog dd = new Dog();
	
		// Animal <---- [Dog.class, Cat.class]
		
		Animal ani = new Dog();
		ani.eat(); 
		
		ani=new Cat();
		ani.eat();
		
		
		
	}

}
