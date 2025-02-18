package tms_test1;

import java.util.Objects;

import tms_testReview.Employee;
import tms_testReview.Person;
import tms_testReview.Reseacher;

public class Lotto {

	private long id;	
	private static String[] lottoNumbers;
	
	public Lotto() {;}

	public Lotto(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}

	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return id == other.id;
	}
	
	public String[] numberChoice() {
		String[] inputStr = new String[6];
		for(int i = 0; i < 6; i++) {
			inputStr[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1 ));
			for(int j = 0; j < i; j++) {
				if(inputStr[i].equals(inputStr[j])) {
					i--;
					break;
				}
			}			
		}
		return inputStr;
	}
		
	public void drawNumber() {	
		setLottoNumbers(numberChoice());
	}
	

	
	public void sellLotto(Person person) {
		if(person instanceof Employee) {
			Employee employee = (Employee)person;
			employee.setLotto(numberChoice());
		}
		else if(person instanceof Reseacher ) {
			Reseacher reseacher = (Reseacher)person;
			reseacher.setLotto(numberChoice());
		}		
	}
	
	public boolean checkLotto(Person person) {		
		boolean result = false;
		if(person instanceof Employee) {
			Employee employee =(Employee)person;	
			result = lottoNumbers.equals(employee.getLotto());
		}
		else if( person instanceof Reseacher) {
			Reseacher reseacher = (Reseacher)person;
			result = lottoNumbers == reseacher.getLotto();
		}
		else {
			System.out.println("로또를 구매할 수 없습니다.");
		}
		return result;
	}
	
	
	
public static void main(String[] args) {
		Lotto lotto = new Lotto();

		Person A = new Employee("1", "일당백", 20, "01077776666", "직업" , "IT"); 
		
		Employee employee = (Employee)A; 
		
		Person B = new Reseacher("2","한우물",35,"01044467878","식물연구원","연구");
		Reseacher reseacher = (Reseacher)B;
		

		lotto.drawNumber();

		lotto.sellLotto(A);
		lotto.sellLotto(B);
		
		employee.byeCompany(lotto.checkLotto(A));
		employee.saveMoney(lotto.checkLotto(A));
			
		reseacher.buyFood(lotto.checkLotto(B));
		reseacher.investLab(lotto.checkLotto(B));

		
	}

	

}
