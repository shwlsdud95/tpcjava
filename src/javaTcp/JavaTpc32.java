package javaTcp;

import kr.tpc.Dbconnect;
import kr.tpc.JavaOracle;
import kr.tpc.JavaPostgresql;

public class JavaTpc32 {

	public static void main(String[] args) {
		
		// Oracle, Postgresql --> Driver Class 인터페이스 강점 예시
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		conn = new JavaPostgresql();
		conn.getConnection("url", "root", "abcde");

	}

}
