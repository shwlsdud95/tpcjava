
package javaTcp;

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtill;

public class JavaTpc18 {

	public static void main(String[] args) {
		
		// 1. Java에서 제공해주는 class들.. API 
		// 문자열(String)
		String str = new String("APPLE");
		
		System.out.println(str.toLowerCase()); 	// 소문자로 바꿔주는 메소드 함수 

		// 2. 직접 만들어서 상용하는 class들 ... DTO/VO, DAO, Utility.. API
		MyUtill my= new MyUtill();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 class들 ...  API
		// Gson --> json	https://mvnrepository.com/
		Gson  g=new Gson();
		
		BookVO vo=new BookVO("자바", 13000, "진영", 800);
		String json=g.toJson(vo);
		// {"title":"자바","price":13000,"company":"진영","page":800} 객체를 문자열에 포맷으로 만들어서 사용하는 데이터 구조
		System.out.println(json);
		
		
		
		
	}

}
