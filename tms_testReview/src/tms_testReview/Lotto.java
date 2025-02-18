package tms_testReview;

import java.util.Objects;

public class Lotto {

//A. 다음 요구사항을 충족하여 문제를 해결하시오.
//공통 요구사항
//-각 클래스는 각 필드의 private이 붙어 있으며, 목적에 맞는 메서드를 구현해야한다
//-각 필드는 생성자를 통해 초기화 하며, 기본 생성자가 존재해야한다.
//(단, 상속받은 클래스는 부모를 통해 초기화한다.)
//-각 클래스는 toString이 재정의 되어 각 필드를 볼 수 있다.
//-각 클래스는 equals, hashcode가 재정의 되어있어 고유의 값(id)을 찾을 수 있다.
//- 어노테이션은 생략하지 않는다.
//- 각 필드는 필요에 따라 알맞는 자료구조를 선택한다.
	

	//클래스 (Lotto)
	//- 고유 번호(id) 필드를 갖는다.
	private String id;
	private static String[] lottoNumbers;
	//- 로또번호(lottoNumbers)는 스태틱 필드를 갖는다.
		
	public Lotto() {;}
	
	public Lotto(String id) {
		this.id = id;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}

	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}
	
	
	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
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
		return Objects.equals(id, other.id);
	}

	
//
//메서드 drawNumber()
//drawNumber()를 사용하여 추첨한다. 추첨은 아래와 같다.
//- 1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
//- 추출한 번호는 문자열 배열로 로또번호(lottoNumbers) 필드에 담아주는 기능을 가진 메서드이다.

	
	public String[] numberChoice() {
		String[] arrInputString = new String[6];
		for(int i = 0; i < 6; i++) {
			arrInputString[i] = String.valueOf((int)Math.floor(Math.random()*45 + 1));
			for(int j = 0; j < i; j++) {
				if(arrInputString[i] == arrInputString[j]) {
					i--;
					break;
				}			
			}
		}
		return arrInputString;
	}
	
	
	public void drawNumber() {	
		setLottoNumbers(numberChoice());
	}
	
	
// 
//메서드 sellLotto()
//- 해당 메서드를 사용하면, 회사원 또는 연구원에게만 로또를 판매하는 기능을 가진 메서드이다.
//(즉 회사원 또는 연구원의 필드에 접근하여 로또 번호를 입력할 수 있다.)
	public void sellLotto(Person person) {
		
		if(person instanceof Employee) {
			Employee employee =(Employee)person;
			employee.setLotto(numberChoice());			
		}
		else if( person instanceof Reseacher) {
			Reseacher reseacher = (Reseacher)person;													
			reseacher.setLotto(numberChoice());			
		}
	}
			
			
// 
//메서드 checkLotto
//- 로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인하여 값을 리턴하는 메서드이다.
//로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//- 로또는 모든 번호가 맞으면 당첨 아니면 꽝! 둘중 하나로만 결과를 알려주는 메서드이다
	public boolean checkLotto(Person person) {		
		boolean result = false;
		if(person instanceof Employee) {
			Employee employee =(Employee)person;	
			result = lottoNumbers == employee.getLotto();
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
	
	

	//Lotto 클래스의 메인메서드 구현
	public static void main(String[] args) {
		
		//- 메인메서드는 아래 각 내용을 순서대로 수행한다
		//- Lotto 객체화(instance)
		Lotto lotto = new Lotto();
		//- 회사원 업캐스팅(upcasting)
		//- 회사원 A : 일당백, 20, 01077776666, IT	
		//- 회사원 다운캐스팅(downcasting)
		Person A = new Employee("1", "일당백", 20, "01077776666", "직업" , "IT"); // 업캐스팅된 Employee
		
		Employee employee = (Employee)A; //다운
		
		//- 연구원 업캐스팅(upcasting)
		//- 연구원 B : 한우물, 35, 01044467878, 
		Person B = new Reseacher("2","한우물",35,"01044467878","식물연구원","연구");
		//- 연구원 다운캐스팅(downcasting)
		Reseacher reseacher = (Reseacher)B;
		
		//- 로또 클래스 drawNumber() 사용한다
		lotto.drawNumber();
		//- sellLotto() 사용하여 연구원, 회사원에게 각각 로또 판매한다
		lotto.sellLotto(A);
		lotto.sellLotto(B);
		

		employee.byeCompany(lotto.checkLotto(A));
		employee.saveMoney(lotto.checkLotto(A));
		
		//- 회사원은 checkLotto() 사용하여 byeCompany() 를 사용한다
		//-  회사원은 checkLotto() 사용하여 saveMoney() 를 사용한다
		
		reseacher.buyFood(lotto.checkLotto(B));
		reseacher.investLab(lotto.checkLotto(B));
		//- 연구원은 checkLotto() 사용하여 investLab() 를 사용한다
		//- 연구원은 checkLotto() 사용하여 buyFood() 를 사용한다
		
	}

	

}
