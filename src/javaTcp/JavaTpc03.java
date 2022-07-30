package javaTcp;

import kr.bit.Book;

public class JavaTpc03 {

	public static void main(String[] args) {
		//관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		
		int a;
		a= 10;
		
		//책 1권을 저장하기위한 변수를 선언하시오.
		Book b;
		b= new Book();
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
		
	}

}
