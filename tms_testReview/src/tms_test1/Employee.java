package tms_test1;

import java.util.Objects;

public class Employee extends Person{
	
	private String [] lotto;
	private String company;

	public Employee() {;}

	public Employee(int id, String name, int age, String phone, String job,String lotto, String company) {
		super(id,name, age, phone, job);
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [lotto=" + lotto + ", company=" + company + "]";
	}

	public String [] getLotto() {
		return lotto;
	}

	public void setLotto(String []lotto) {
		this.lotto = lotto;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, lotto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && Objects.equals(lotto, other.lotto);
	}

	
	@Override
	public void work() {
	System.out.println(job + "은 하루 종일 일을 한다.");
	}
	
	public void byeCompany(boolean win) {
		if(win) {
			System.out.println("직장을 그만둔다.");
		}else {
			System.out.println("다시 일한다.");
		}
	}
	
	public void saveMoney(boolean win) {
		if(win) {
			System.out.println("전액을 저축한다.");
		}else {
			System.out.println("다시 돈 번다.");
		}
	}
}
