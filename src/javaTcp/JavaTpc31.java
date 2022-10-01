package javaTcp;

import kr.tpc.Inflearn;

public class JavaTpc31 {

	public static void main(String[] args) {
		
		//Inflearn inf = new Inflearn(); --> 클래스가 private로 변경하면 호출 하지 못한다.
		//inf.tpc();
		//inf.java();
		Inflearn.tpc();
		Inflearn.java();
		
		// Java API private
		//System sys = new System();
		System.out.println("출력");
		// Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
		
	}

}
