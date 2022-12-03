package javaTcp;

import kr.poly.RemoCon;
import kr.poly.TV;

public class JavaTpc27 {

	public static void main(String[] args) {
		
		// RemoCon 으로 TV 클래스를 구동하시오. 
		
		RemoCon r = new TV();
		
		for(int i=0;i<40;i++) {
			r.chUP();
			
		}
		
		for(int i=0;i<40;i++) {
			r.chDown();
			
		}
		
		
		//r.chDown();
		//r.internet();
		
		
		
	}

}
