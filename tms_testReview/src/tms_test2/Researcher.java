package tms_test2;

import java.util.Objects;

public class Researcher extends Person {
	private String lotto;
	private String search;
	
	public Researcher() {;}

	public Researcher(String id, String name, int age, String phone, String job, String lotto, String search) {
		super(id, name, age, phone, job);
		this.lotto = lotto;
		this.search = search;
	}

	@Override
	public String toString() {
		return "Researcher [lotto=" + lotto + ", search=" + search + "]";
	}

	public String getLotto() {
		return lotto;
	}

	public void setLotto(String lotto) {
		this.lotto = lotto;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
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
		Researcher other = (Researcher) obj;
		return Objects.equals(lotto, other.lotto) && Objects.equals(search, other.search);
	}
	
	@Override
	public void work() {
		System.out.println("연구원은" + search + "중이다.");
	}
	
	
}
