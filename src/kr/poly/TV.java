package kr.poly;

public class TV implements RemoCon {
	
	int currch = 70;
	
	@Override
	public void chUP() {
		
		if(currch < RemoCon.MAXCH) {
			currch++;
			System.out.println("tv의 채널이 올라간다.:"+currch);
			
		}else {
			
			currch=1;
			System.out.println("tv의 채널이 올라간다.:"+currch);
			
		}
		
	}

	@Override
	public void chDown() {
		
		if(currch > RemoCon.MINCH) {
			currch--;
			System.out.println("tv의 채널이 내려간다.:"+currch);
			
		}else {
			currch= 100;
			System.out.println("tv의 채널이 내려간다.:"+currch);
		}
		
		
		
	}

	@Override
	public void internet() {
		
		System.out.println(" 인터넷이 된다.");
		
	}
	// 추가적인 기능을 구현...
	

}
