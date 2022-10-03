package javaTcp;

import kr.tpc.BookDTO;

public class JavaTpc13 {

	public static void main(String[] args) {
		// 책 -->  class(BookDTO) --> 객체 --> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 900;
		
		// 배열은 자료형이 일치하여야 가능
		// 배열이 안된다면 직접 설계해야 한다.
		
		BookDTO dto;	// dto(object: 객체) 
		
		dto = new BookDTO(title, price, company, page);	// dto(Instance:인스턴스)
		
		bookPrint(dto);

	}

	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page + "\t");
		
		
	}
	
}
