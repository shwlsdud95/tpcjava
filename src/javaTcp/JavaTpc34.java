// import java.lang.*;
package javaTcp;

public class JavaTpc34 {

	public static void main(String[] args) {
		
		//Sting api 활용 
		String str = new String("APPLE");
		// 소문자 함수
		String v = str.toLowerCase();
		System.out.println(v);	//apple
		// 자릿수 체크
		System.out.println(str.charAt(2));
		// 길이 체크
		System.out.println(str.length());
		// 글자 위치 값
		System.out.println(str.indexOf("PL"));
		// 없는 글자 위치 값
		System.out.println(str.indexOf("PX"));	// -1 은 실패시 뜨는 숫자 
		// 글자 찾아서 바꾸기
		System.out.println(str.replaceAll("P", "X")); 	// AXXLE
		
		
	}

}
