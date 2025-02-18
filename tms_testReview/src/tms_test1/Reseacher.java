package tms_test1;

import java.util.Objects;

public class Reseacher extends Person {

	String[] lotto;
	String search;
	
	public Reseacher() {;}
	

	public Reseacher(int id, String name, int age, String phone, String job, String search) {
		super(id, name, age, phone, job);

		this.search = search;
	}


	@Override
	public String toString() {
		return "reseacher [lotto=" + lotto + ", search=" + search + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lotto, search);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
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
	public void work() {
	System.out.println("연구원은" + search + "중이다.");
	}
	
	
	public void investLab(boolean win){
		if(win) {
			System.out.println("연구에 투자한다.");
		}else {
			System.out.println("나에게 투자한다.");
		}
	}

	public void buyFood(boolean win){
		if(win) {
			System.out.println("지인에게 밥을 산다.");
		}else {
			System.out.println("집에 쌀을 산다.");
		}
	}
}
