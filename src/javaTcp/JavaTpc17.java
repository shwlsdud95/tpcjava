package javaTcp;

import kr.tpc.MovieVO;

public class JavaTpc17 {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int[] b = {10, 20, 30, 40, 50};
		
		int[] c = new int[] {10, 20, 30, 40 , 50};
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 영화 (제목, 가격, 주인공, 등급, 시간)
		
		MovieVO mv=new MovieVO("비트", 12000, "연기자", 12, 1.3f);
		
		System.out.println(mv);
		
		System.out.println("-----------------------------------------------------------");
		//  영화 3편을 저장
		
		MovieVO[] marr = new MovieVO[4];
		marr[0] = new MovieVO("비트", 12000, "연기자", 12, 1.3f);
		marr[1] = new MovieVO("한산", 12000, "박해일", 13, 2.3f);
		marr[2] = new MovieVO("아이언맨", 12000, "로버트다우니주니어", 15, 3.3f);
		marr[3] = new MovieVO("아이언맨", 12000, "로버트다우니주니어", 15, 3.3f);
		
		System.out.println(marr[0]);
		System.out.println(marr[1]);
		System.out.println(marr[2]);
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0; i<marr.length; i++) {
			
			if(i < 3 ) {
				
				System.out.println(marr[i]);
				
			}else {
				
				System.out.println("4번째 영화는 미개봉입니다.");
			}
			
		}
		
	}

}
