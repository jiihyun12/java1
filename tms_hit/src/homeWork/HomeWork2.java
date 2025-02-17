//	2. 배열을 이용하여 아래와 같은 형식으로 출력한다.
//
//	패키지명 : ex02
//	클래스명 : TwoArray
//
//	[출력결과]
//	배열의 행 길이 : 3
//	배열의 열 길이 : 4
//	1 2 3 4 
//	5 6 7 8
//	9 10 11 12
//	 
//

package homeWork;

public class HomeWork2 {
	int [] arr1 = new int[12];
	int col = 3; 
	int row = 4;
	
	public void twoArray(int[]arr1) {
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + " "); // 1 2 3 4 5 6 7 8 9 10 11 12 출력
											// 4개씩 출력한 후 줄바꿈 필요
											// 4,8,12번째 숫자에서 줄바꿈		
			if(( i + 1 ) % 4 == 0) {
				System.out.println();      //  (i + 1) % 4 == 0조건을 만족할때마다 줄바꿈
			}
		}
	}
	
	public static void main(String[] args) {
		HomeWork2 hw2 = new HomeWork2();
		int arr1[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		hw2.twoArray(arr1);
	}
	
}


//  4개씩 나눠야한다는 생각은 드는데 줄바꿈을 해야한다는 생각까지 못 감
//  (i + 1) % 4 == 0조건을 만족할때마다 줄바꿈 이 로직 전혀 생각 못 함