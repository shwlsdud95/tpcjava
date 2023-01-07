package javaTcp;

public class JavaTpc35 {

	public static void main(String[] args) {
		
		// 객체를 새로 생성해주는거기 때문에 같은 값이 아니며 힙메모리가 띠로 생성된다. 
		String str1= new String("APPLE");
		String str2= new String("APPLE");
		
		if(str1==str2) {	// 번지수 비교 
			
			System.out.println("yes");
		} else {
			
			System.out.println("no");
		}
		
		if(str1.equals(str2)) {		// 값 비교 
			System.out.println("yes");
		} else {
			System.out.println("no");
			
		}
		
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3==str4) {	// 객체를 새로 생성하주지 않았기 때문에 같은 번지수
			System.out.println("yes");
			
		} else {
			System.out.println("no");
			
		}
		
		
	}

}
