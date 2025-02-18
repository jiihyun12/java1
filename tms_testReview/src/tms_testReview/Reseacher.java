package tms_testReview;

import java.util.Objects;

public class Reseacher extends Person {
	//A. 다음 요구사항을 충족하여 문제를 해결하시오.
	//공통 요구사항
	//-각 클래스는 각 필드의 private이 붙어 있으며, 목적에 맞는 메서드를 구현해야한다
	//-각 필드는 생성자를 통해 초기화 하며, 기본 생성자가 존재해야한다.
	//(단, 상속받은 클래스는 부모를 통해 초기화한다.)
	//-각 클래스는 toString이 재정의 되어 각 필드를 볼 수 있다.
	//-각 클래스는 equals, hashcode가 재정의 되어있어 고유의 값(id)을 찾을 수 있다.
	//- 어노테이션은 생략하지 않는다.
	//- 각 필드는 필요에 따라 알맞는 자료구조를 선택한다.
	public Reseacher() {;}
	
	private String[] lotto;
	private String search;
	
	public Reseacher(String id, String name, int age, String phone, String job, String search) {
		super(id,name, age, phone, job );
		this.search = search;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lotto, search);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reseacher other = (Reseacher) obj;
		return Objects.equals(lotto, other.lotto) && Objects.equals(search, other.search);
	}
	
	public String[] getLotto() {
		return lotto;
	}
	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}

	
	@Override
	public String toString() {
		return "Reseacher [lotto=" + lotto + ", search=" + search + "]";
	}
	
	
	
	
	//연구원
	//각 필드는 아래와 같다.
	//-로또(lotto), 조사(search)
	//- work() 메서드를 재정의하며 "연구원은 조사(search)중이다."를 출력한다.
	@Override
	public void work() {
		System.out.println("연구원은" + getSearch() + "중이다.");
	}
	
	//- 조사(search)은 초기화된 필드의 값으로 출력한다.
	
	//
	//- 회사원과 연구원이 가진 로또 번호가 
	//당첨(1등) 또는 꽝 각각의 메서드를 실행한다.
	//연구원
	//- investLab()
	//연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
	//1등이 아닐 시 콘솔에 “나에게 투자한다”를 출력한다.
	//
	public void investLab(boolean win) {
		String result = "";
		result = win ? "연구에 투자한다." : "나에게 투자한다.";
		System.out.println(result);
	}
	//- buyFood()
	//연구원 1등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.
	//1등이 아닐 시 콘솔에 “집에 쌀을 산다”를 출력한다.
	
	public void buyFood(boolean win) {
		String result = "";
		result = win ? "지인에게 밥을 산다." : "집에 쌀을 산다.";
		System.out.println(result);
	}
}
