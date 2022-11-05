package kr.tpc;

public class MemberVO {
	
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// 디폴트 생성자 
	public MemberVO() {}

	// 초기값 설정 
	public MemberVO(String name, int age, String tel, String addr) {

		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// setter getter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 디버깅을 하기 쉽게 문자열로 출력
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	

}
