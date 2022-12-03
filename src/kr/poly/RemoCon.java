package kr.poly;

public interface RemoCon {	// 객체생성 x ; RemoCon r = new RemoCon();

	// 상수를 사용가능
	public static final int  MAXCH = 100;	// RemoCon.MAXCH
	public static final int  MINCH = -1;	// RemoCON, MINCH
	
	// 추상메서드 
	
	// 인터페이스 클래스를 생성하면 abstract이 생략이 된다.
	
	public abstract void chUP();
	
	public abstract void chDown();
	
	public abstract void internet();
	
}
