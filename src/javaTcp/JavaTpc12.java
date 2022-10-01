package javaTcp;

import kr.tpc.BookVO;

public class JavaTpc12 {

	public static void main(String[] args) {
		// 생성자 --> 생성 + 초기화 --> 메서드 중복정의 가능 
		
		BookVO b1 = new BookVO(); 
		
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page);
		
		BookVO b3 = new BookVO("python", 13000, "경기도청", 600);
		System.out.print(b3.title + "\t");
		System.out.print(b3.price + "\t");
		System.out.print(b3.company + "\t");
		System.out.println(b3.page + "\t");
		
		
		
	}

}
