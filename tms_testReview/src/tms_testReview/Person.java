package tms_testReview;

import java.util.Objects;

public class Person {
	
	//A. 다음 요구사항을 충족하여 문제를 해결하시오.
	//공통 요구사항
	//-각 클래스는 각 필드의 private이 붙어 있으며, 목적에 맞는 메서드를 구현해야한다
	//-각 필드는 생성자를 통해 초기화 하며, 기본 생성자가 존재해야한다.
	//(단, 상속받은 클래스는 부모를 통해 초기화한다.)
	//-각 클래스는 toString이 재정의 되어 각 필드를 볼 수 있다.
	//-각 클래스는 equals, hashcode가 재정의 되어있어 고유의 값(id)을 찾을 수 있다.
	//- 어노테이션은 생략하지 않는다.
	//- 각 필드는 필요에 따라 알맞는 자료구조를 선택한다.
	public Person() {;}
	
	private String id;
	private String name;
	private int age;
	private String phone;
	private String job;
	
	
	public Person(String id, String name, int age, String phone, String job) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", job=" + job + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, job, name, phone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(job, other.job)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
	
//사람(Person)
//각 필드는 아래와 같다.
//- 아이디(id), 이름(name), 나이(age), 전화번호(콜), 직업(job)
//- 회사원과 연구원은 사람을 상속 받으며, 부모를 생성자(constructor)를 통해 초기화한다.
//- 일한다(work)의 메소드를 갖는다
//- 메소드는 “일을 합니다”를 출력한다.
	
	public void work() {
		System.out.println("일을 합니다.");
	}


}
