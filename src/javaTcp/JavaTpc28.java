package javaTcp;

import kr.poly.A;

public class JavaTpc28 {

	public static void main(String[] args) {
		
		A a=new A();
		a.display();
		//System.out.println(a.toString());
		System.out.println(a);	//Object --> toWString() : kr.poly.A@279f2327 번지
		
		Object o = new A();	// upcasting
		((A)o).display();
		System.out.println(o.toString());
	
	}

}
