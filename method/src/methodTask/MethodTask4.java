package methodTask;

import java.util.Scanner;

public class MethodTask4 {
//	1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//	int getCountOfCharactorInContent(String content, char c) {
//		int count = 0;
//		for(int i = 0; i < content.length(); i++) {
//			if(content.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
	
	
//	2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
//	int getValueInArray(int[] arData, int index) {
//		return arData[index];
//	}
//	
	
//	3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//	String changeToInteger(String hangle) {
////		.indexOf('일') : 값이 있으면 그 index 값을 리턴
//		String hangles = "공일이삼사오육칠팔구";
//		String result = "";
//		for(int i = 0; i < hangle.length(); i++) {
//			result += hangles.indexOf(hangle.charAt(i));
//		}
//		return result;
//	}
	
	
//	4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	
//	최솟값과 최댓값 선언
//	더 작은 값이 있으면 최솟값
//	더 큰 값이 있으면 최댓값
//	return으로 최솟값, 최댓값을 배열로 반환
	
	int[] getMinMax1(int[] arrData) {
	    int[] minMax = new int[2]; 
	    
	    minMax[0] = arrData[0]; 
	    minMax[1] = arrData[0]; 

	    for (int i = 1; i < arrData.length; i++) {
	        if (arrData[i] < minMax[0]) {
	        	minMax[0] = arrData[i];
	        }
	        if (arrData[i] > minMax[1]) {
	        	minMax[1] = arrData[i]; 
	        }
	    }

	    return minMax; 
	}

		
	
//	5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개 : 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
	
	// void로 매개변수 배열에 저장
	
//	void getMinMax2(int[] arrData, int[] resultArr) {
//	    resultArr[0] = arrData[0]; 
//	    resultArr[1] = arrData[0]; 
//
//	    for (int i = 1; i < arrData.length; i++) {
//	        if (arrData[i] < resultArr[0]) {
//	        	resultArr[0] = arrData[i];
//	        }
//	        if (arrData[i] > resultArr[1]) {
//	        	resultArr[1] = arrData[i]; 
//	        }
//	    }
//	}

	
		

	
	
//	6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
			
//			문자열을 입력받기
//			한 글자씩 반복문 돌기
//			해당 문자가 검색할 문자와 같으면 출력
			
//	void indexOf(String srtAll, char searchChar) {
//		char[] resultArr = new char[srtAll.length()];
//		int count = 0;
//		for(int i = 0; i < srtAll.length(); i++) {
//			resultArr[i] = srtAll.charAt(i);
//			count++;
//		}
//		for(int i = 0; i < count; i++) {
//			if(resultArr[i] == searchChar) {
//				System.out.println("문자" + resultArr[i] + "문자의 위치" + i);				
//			}
//		}
//	};
	
	
	
	
	
	// 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask4 mt4 = new MethodTask4(); 
		
		// 4번 ===================================================================================
		int[] numbers = new int[5];
		System.out.println("정수를 5개 입력하세요:");		
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
		
        int[] minMaxReturn = mt4.getMinMax1(numbers);
        
        System.out.println("최솟값 : " + minMaxReturn[0] + ", 최댓값 : " + minMaxReturn[1]);
        
        
        
        
        // 5번 ===================================================================================
//        int[] resultArr = new int[2]; 
//        mt4.getMinMax2(numbers, resultArr);
//        
//        System.out.println("최솟값 : " + resultArr[0] + ", 최댓값 : " + resultArr[1]);
		 
		
        
        
		// 6번 ===================================================================================
//		System.out.println("문자열을 입력하세요");
//		String inputStr1 = sc.nextLine();
//		
//		System.out.println("검색할 문자를 입력하세요");
//		String inputStr2 = sc.nextLine();
//		
//		mt4.indexOf(inputStr1, inputStr2);
		
	}
	
	
	
	
	
}










