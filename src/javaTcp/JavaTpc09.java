package javaTcp;

public class JavaTpc09 {

	public static void main(String[] args) {
		
		int a= 56;
		int b= 40;
		
		//int v= sum(a,b);
		JavaTpc09 tpc = new JavaTpc09(); // heap area (힙) 생성
		int v = tpc.sum(a, b);
		System.out.println(v);
	}

	public int sum(int a, int b) {
		
		int v = a+b;
		return v;
		
	}
	
}
