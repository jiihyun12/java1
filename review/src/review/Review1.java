
// 복습 및 예제

package review;

public class Review1 {
					
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
//	총점과 평균을 출력하기
	
	int number;
	String name;
//	int kor;
//	int eng;
//	int math;
//	int total;
	double kor;
	double eng;
	double math;
	double total;
	double average;
	
	public Review1() {;}
	
	public Review1(double number) {;}
	public Review1(String name) {;}
	public Review1(int number, String name) {;}
	
	public Review1(int number, String name, double kor, double eng, double math) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
//		this.average = Double.parseDouble(String.format("%.3f",total / 3.0));
		// String.format()은 숫자, 날짜, 문자열 등 다양한 데이터를 원하는 형식으로 변환할 때 사용된다.
		// String.format("%.3f", total / 3.0)은 평균을 소수점 3자리까지 반올림해서 문자열로 변환하는 역할
		
		this.average = Double.parseDouble(String.format("%.3f",total / 3.0));
		
	}
	
	
//	총점과 평균을 출력하기
	public static void main(String[] args) {
		
//		Review1 baby = new Review1(1, "baby", 95, 60, 40);
		Review1 baby = new Review1(1, "baby", 95.55, 60.55, 40.55);
		Review1 babyBoo = new Review1();
		System.out.println("총점 : " + baby.total);
		System.out.println("평균 : " + baby.average);
	}
}

