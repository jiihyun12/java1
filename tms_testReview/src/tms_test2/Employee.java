package tms_test2;

import java.util.Objects;

public class Employee extends Person {
	
	private String [] lotto;
	private String company;
	
	public Employee() {;}

	public Employee(String id, String name, int age, String phone,String job, String company) {
		super(id, name, age, phone, job);
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [lotto=" + lotto + ", company=" + company + "]";
	}

	public String [] getLotto() {
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
	
	@Override
	public void work() {
		System.out.println(job + "은 하루종일 일을 한다.");
	}
	
}
