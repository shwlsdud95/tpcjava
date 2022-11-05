package javaTcp;

import kr.tpc.MemberVO;

public class JavaTpc14 {

	public static void main(String[] args) {	
		
	MemberVO m = new MemberVO();
	
	m.setName("홍길동");
	m.setAge(50);
	m.setAddr("서울");
	m.setTel("010-1111-1111");
	
	System.out.println(m.getName()+"\t");
	System.out.println(m.getAge()+"\t");
	System.out.println(m.getTel()+"\t");
	System.out.println(m.getAddr()+"\t");
	
	/*
	m.name = "홍길동";
	m.age = 18;
	m.addr = "서울";
	m.tel = "010-2877-2619"; 
	*/

	}

}
