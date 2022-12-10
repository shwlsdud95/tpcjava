package javaTcp;

import kr.tpc.A;
import kr.tpc.B;

public class JavaTpc29 {

	public static void main(String[] args) {
		
		A a= new A();
		display(a);
		
		B b= new B();
		display(b);

	}

	private static void display(Object o) {	// 다형성 인수
		
		if(o instanceof A) {
			((A)o).go();
		}else {
			
			((B)o).go();
		}
		
	}

	

}
