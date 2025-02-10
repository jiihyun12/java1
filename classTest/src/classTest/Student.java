package classTest;

import java.util.Scanner;

public class Student {
//학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
//총점과 평균을 출력하기
	
	int studentNumber;
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	int totalScore;
	double avgScore;		
	
	public Student() {;}
	
	public Student(String name, int studentNumber, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.studentNumber = studentNumber;
		
	}

	
	public static void main(String[] args) {
			
	// 점수를 입력하기
	Scanner sc = new Scanner(System.in);
	
	
	}
	
	
}

