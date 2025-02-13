package objectTest;

public class Sports { // public class Sports extends가 생략돼있는 상태
	
//	1. 기본 생성자
//	2. 초기화 생성자
//	3. private 붙이기
//	4. getter, setter
//	5. toString 재정의
//	6. hashcode, equals 재정의
	
	
	
//	alt shift a 하고 드래그해서 작성
	private String type;
	private int total;
	
	// 기본 생성자
	public Sports() {;}
	
	// 초기화 생성자
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	
	
//	toString 재정의
//	alt shift s -> s
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	
	
//	getter, setter 단축키
//	alt shift s -> r -> alt + a -> r
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		
//		System.out.println(sports.hashCode());
		System.out.println(sports.toString()); // toString -> 클래스를 문자열로 바꾸는 것
											// 출력은 주소값
											// 내 필드값이 어떤 값이 들어가있는지 확인하기 위한 목적
//		sports.equals(sports);
	}
}
