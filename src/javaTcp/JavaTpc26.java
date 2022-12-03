package javaTcp;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class JavaTpc26 {

	public static void main(String[] args) {
		
		RemoCon r = new TV();
		r.chUP();
		r.chDown();
		r.internet();
		
		
		r = new Radio();
		r.chUP();
		r.chDown();
		r.internet();
		
		
		
	}

}
