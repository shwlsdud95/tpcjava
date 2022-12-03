package kr.poly;

public class TV implements RemoCon {

	@Override
	public void chUP() {
		
		System.out.println("tv의 채널이 올라간다.");
		
	}

	@Override
	public void chDown() {
		
		System.out.println("tv의 채널이 내간다.");
		
	}

	@Override
	public void internet() {
		
		System.out.println(" 인터넷이 된다.");
		
	}
	// 추가적인 기능을 구현...
	

}
