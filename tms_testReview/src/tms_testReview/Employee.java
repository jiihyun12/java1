package tms_testReview;

import java.util.Objects;

public class Employee extends Person{
	//A. 다음 요구사항을 충족하여 문제를 해결하시오.
	//공통 요구사항
	//-각 클래스는 각 필드의 private이 붙어 있으며, 목적에 맞는 메서드를 구현해야한다
	//-각 필드는 생성자를 통해 초기화 하며, 기본 생성자가 존재해야한다.
	//(단, 상속받은 클래스는 부모를 통해 초기화한다.)
	//-각 클래스는 toString이 재정의 되어 각 필드를 볼 수 있다.
	//-각 클래스는 equals, hashcode가 재정의 되어있어 고유의 값(id)을 찾을 수 있다.
	//- 어노테이션은 생략하지 않는다.
	//- 각 필드는 필요에 따라 알맞는 자료구조를 선택한다.
	private String[] lotto;
	private String company;
	
	public Employee() {;}
	
	
	public Employee(String id, String name, int age, String phone, String job, String company ) {
		super(id, name, age, phone, job);
		this.company = company;
	}


	@Override
	public String toString() {
		return "Employee [lotto=" + lotto + ", company=" + company + "]";
	}


	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(company, lotto);
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
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && Objects.equals(lotto, other.lotto);
	}


	public String[] getLotto() {
		return lotto;
	}


	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	

	


	
//
//회사원(Company)
//각 필드는 아래와 같다.
//-로또(lotto), 회사(company)
//- work() 메서드를 재정의하며 "직업(job)은 하루종일 일을한다"를 출력한다.
//- 직업(job)은 초기화된 필드의 값으로 출력한다.
	@Override
	public void work() {
//		System.out.println( this.getJob() + "은 하루종일 일을 한다"); 
		System.out.println( getJob() + "은 하루종일 일을 한다"); 
		// this??
	}
	

//회사원
//- byeCompany()
//회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
//1등이 아닐 시 콘솔에 “다시 일한다”를 출력한다.
//
	public void byeCompany(boolean win) {
		String result = "";
		result = win ? "직장을 그만둔다" : "다시 일한다";
		System.out.println(result);
	}
//- saveMoney()
//회사원 1등 시 콘솔에 "전액을 저축한다"를 출력한다.
//1등이 아닐 시 콘솔에 “다시 돈 번다”를 출력한다.
//
	public void saveMoney(boolean win) {
		String result = "";
		result = win ? "전액을 저축한다" : "다시 돈 번다";
		System.out.println(result);
	}

}
