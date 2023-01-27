package javaTcp;

import java.util.ArrayList;

import kr.tpc.BookDTO;

public class JavaTpc38 {

	public static void main(String[] args) {
		
		ArrayList<BookDTO> list = new ArrayList<BookDTO>(1); 	// <BookDTO> 은 안전하게 북디티오만 받겠다라는 뜻 
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 12000, "에이콘", 700));
		list.add(new BookDTO("파이썬", 12000, "제이펍", 690));
		
		for(int i=0; i<list.size();i++) {
			//Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
			
		}
		
		
		
	}

}
