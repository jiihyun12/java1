//	클래스 Lotto
//	메서드 drawNumber로 추첨한다. 추첨은 아래와 같다.
//	1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
	
//
//	메서드 checkLotto
//	로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인한다.
//	로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.

//	회사원과 연구원이 가진 로또 번호가 
//	1등 또는 2등이라면 각각의 메서드를 실행한다.
//	회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
//	회사원 2등 시 콘솔에 "전액을 저축한다"를 출력한다.
	
//	연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
//	연구원 2등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.
	


//------------------------------------------------------

package lotto;

import java.util.Scanner;

public class LottoTest {
	
//	drawNumber메서드 생성
//	랜덤한 숫자 6개 추출. 6까지 반복문
//	근데 이 6개는 1~45까지의 배열
//	Random 이용해 랜덤 숫자를 생성
	
	public LottoTest() {;}
		
	public String[] drawNumber() { // 랜덤 숫자 6개 
		String[] randomNums = new String[6];
	
		for(int i = 0; i < 6; i++) {
			randomNums[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
			for(int j = 0; j < i; j++) {
				if(randomNums[j].equals(randomNums[i])) {
					i--; 
					break; 
				}
			}
		}
		
		return randomNums; 
	}
	
	
	// 회사원과 연구원만 구매할 수 있게 한다.
	// 참가자의 로또 번호와 당첨 번호를 비교한다.
//	6개가 다 맞으면 1등, 5개가 맞으면 2등	
	
	// if 회사원or연구원 아닐경우 로또를 구매할 수 없다는 문구 출력
	
	public String[] checkLotto( String job) {
		String[] arr = new String[6];
		
		if( job.equals("회사원") ) {
			arr = drawNumber();
			
		}else if(job.equals("연구원")) {
			arr = drawNumber();
		}else {
			System.out.println("로또를 구매할 수 없습니다.");
		}
		return arr;
	}


	
	
//	Lotto 객체를 생성하고 당첨 번호를 추첨한다.
//	여러 명의 참가자를 생성한다.
//	각 참가자의 로또 번호와 당첨 번호를 비교하여 당첨 여부를 출력한다.
	

	public static void main(String[] args) {
		LottoTest lotto = new LottoTest();
//		Job job = new Job("회사원");
		Job job = new Job("연구원");
//		Job job = new Job("학생");
		
		String[] luck = new String[6];
		String[] person = new String[6];
		
		int count = 0;
		luck = lotto.drawNumber(); // 1등 번호
		person = lotto.checkLotto(job.getJob());
		
//		person = lotto.drawNumber();
		
		
		if( job.getJob().equals("회사원") || job.getJob().equals("연구원")) {
		
		for(int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(person[i].equals(luck[j])) {
					count++;
				}
			}		
		}
			
		String message = "이번주 로또 번호 : ";
		String message2 = "내 번호 : ";
		String luckNum = "";
		String personNum = "";
		
		for( int i = 0; i < 6; i++) {
			 luckNum += luck[i] + " ";
		}
		
		for(int i = 0; i < 6; i++) {
			personNum += person[i] + " ";
		}

			
		System.out.println(message + luckNum);
		System.out.println(message2 + personNum);
		System.out.println("겹치는 숫자 : " + count + " 개");

		
		
	
//	회사원 1등이면 -> 직장을 그만둔다.
//	회사원 2등이면 -> 전액을 저축한다.
//	연구원 1등-> 연구에 투자한다.
//	연구원 2등 -> 지인에게 밥을 산다.
//	그 외 꽝

	
		if(job.getJob().equals("회사원") && count == 6) {
			System.out.println("직장을 그만둔다");
			
		}else if( job.getJob().equals("회사원") && count == 5) {
			System.out.println("전액을 저축한다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		
		if(job.getJob().equals("연구원") && count == 6) {
			System.out.println("연구에 투자한다.");
			
		}else if( job.getJob().equals("연구원") && count == 5) {
			System.out.println("밥을 산다.");
		}else {
			System.out.println("꽝입니다.");
		}	
		}
	}
}
