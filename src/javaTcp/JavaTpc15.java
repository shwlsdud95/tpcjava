package javaTcp;

import kr.tpc.MemberVO;

public class JavaTpc15 {

	public static void main(String[] args) {
		
	MemberVO m=new MemberVO("홍길동", 40, "010-1111-1111", "안산");
	//setter method - x
	
	//toString 은 생략 가능 m1 
	System.out.println(m.toString());
	
	MemberVO m1 = new MemberVO();
	
	m1.setName("나길동");
	m1.setAge(30);
	m1.setTel("010-2222-2222");
	m1.setAddr("서울");
	
	System.out.print(m1.getName()+"\t");
	System.out.print(m1.getAge()+"\t");
	System.out.print(m1.getTel()+"\t");
	System.out.println(m1.getAddr()+"\t");
	
	
	}

}
