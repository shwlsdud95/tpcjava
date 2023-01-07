package kr.infrine;

// defaul는 생략이 아닌 의미적으로 부여됨
public class MyClass {
	
	public int sum(int a, int b) {
		int hap=0;
		
		for(int i=a; i<=b; i++) {
			hap+=i;
			
		}
		return hap;
	}

}
