package javaTcp;

public class JavaTpc06 {

	public static void main(String[] args) {
		// 메서드 --> 동작(method), 기능(function)
		
		int a = 10;
		int b = 20;
		
		int result = sum(a,b);
		
		System.out.println(result);
		
		int[] arr= makeArr(); //10,20,30 이 넘어옴 	
			int hap=0;
			for(int i=0; i<arr.length; i++) {
					hap+=arr[i];
					
			}
			System.out.println(hap);
	}
	
	
	
	
		// 정수 2개를 매게변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오. 
		// void 는 리턴하지 않기 때문에 값의 따라 타입을 지정해주고 리턴해야한다. 
		// 메인에서 sum 메서드를 호출하기 위해선 메모리에 스택이 쌓여야 호출됨 
		public static int sum(int a, int b) {
			int v = a+b;
			return v;
			
		}
		
		public static int[] makeArr() {
			int x=10;
			int y=20;
			int z=30;
			
			int[] arr=new int[3];
			arr[0]=x;
			arr[1]=y;
			arr[2]=z;
			
			return arr;
		} 

}
