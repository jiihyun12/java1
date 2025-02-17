package array;

public class MethodTest {
	
//	~~하겠다 (아마도)
	
	
	
	// 배열에 접근해서 값에 10을 더해준다.
//	void add10(int[] arr) {	
//		for(int i =  0; i < arr.length; i++) {
//			arr[i]+=10;
//		}
//	}
//	
//	public static void main(String[] args) { //위에서 기능만 실행하기때문에 void 타입
//		new MethodTest().add10(new Calc().arr2);
//	}
	
//	뭘 어떻게 할지 내가 정해서 하기
	
	
// -------------------------------------------------------------------------------
	
	
// 1. 정수 배열을 받아서, 배열의 모든 숫자를 더하는 메서드를 작성하시오."
//	 메서드 이름은 sumArray로 할 것
//	 매개변수로 int[] 타입의 배열을 받을 것
//	 배열의 합계를 return할 것
//	 메인 메서드에서 sumArray를 실행하고 결과를 출력할 것
	
//	public static int sumArray( int[]arr1 ){
//		int result = 0;
//		for(int i = 0; i < arr1.length; i++) {
////			result += i;
//			result += arr1[i];		
//		}	
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		int[] arrNums = {1,2,3,4,5,6,7,8,9,10};
//		int sum = MethodTest.sumArray(arrNums);
//		System.out.println(sum);  
//	}
	
	
	
//	2. "정수 배열을 받아서, 배열 안에서 가장 큰 숫자를 찾아 반환하는 메서드를 작성하시오."
//
//	✔ 메서드 이름은 findMax
//	✔ 매개변수로 int[] 타입의 배열을 받을 것
//	✔ 배열에서 가장 큰 숫자를 찾아서 return할 것
//	✔ 메인 메서드에서 findMax를 실행하고 결과를 출력할 것
	
	
//	public static int findMax(int[]arr2) {
////		int max = 0;
////		int min = 0;
//		int max = arr2[0];
//		int min = arr2[0];
//		for(int i = 0; i < arr2.length; i++) {
////			arr2[i] > max ? arr2[i] : min = arr2[i];
//			if(arr2[i]>max) {
//				max = arr2[i];
//			}
//		}
//		return max;
//	}
//	
//	public static void main(String[] args) {
//		int[] arrNums2 = {1,2,5,10};
//		int reuslt = MethodTest.findMax(arrNums2);
//		System.out.println(reuslt);
//	}
	
	
	
	
//	3. 배열에서 특정 숫자의 개수 찾기
//	💡 "정수 배열과 특정 숫자를 입력받아서, 배열에서 그 숫자가 몇 개 있는지 반환하는 메서드를 작성하시오."
//
//	✔ 메서드 이름은 countOccurrences
//	✔ 매개변수로 int[] 배열과 int targetNumber(찾을 숫자)를 받을 것
//	✔ 배열을 순회하면서 targetNumber가 몇 개 있는지 세고 반환할 것
//	✔ 메인 메서드에서 countOccurrences를 실행하고 결과를 출력할 것
	
//	public int countOccurrences(int[]arr3, int targetNumber) {
//		int count = 0;
//		for(int i = 0; i < arr3.length; i++) {
//			if(arr3[i] == targetNumber) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	public static void main(String[] args) {
//		MethodTest mt = new MethodTest();
//		int[] arrNums = {0,1,2,7,7,7,7};
//		int num1 = 7;
//		int result = mt.countOccurrences(arrNums , num1);
//		System.out.println("숫자" + num1 + "의 갯수 : " + result + "개");
//	}
	
	
//	4. 배열에서 짝수 개수 찾기
//	💡 "정수 배열을 받아서, 배열에서 짝수의 개수를 찾아 반환하는 메서드를 작성하시오."
//
//	✔ 메서드 이름: countEvens
//	✔ 매개변수로 int[] 배열을 받을 것
//	✔ 배열에서 짝수(% 2 == 0)인 숫자의 개수를 찾아 return할 것
//	✔ 메인 메서드에서 countEvens를 실행하고 결과를 출력할 것
	
//	클래스 이름 : MethodTest
	
//	public int countEvens(int[]arr1) {
//		int count = 0;
//		for(int i = 0; i < arr1.length; i++) {
//			if(arr1[i] % 2 == 0) {
//				count++;
//			}
//		}
//		return count;
//	} 
//	
//	public static void main(String[] args) {
//		MethodTest mt = new MethodTest();
//		int [] arrNums = {1,2,3,4,5};
//		int result = mt.countEvens(arrNums);
//		System.out.println("짝수 : " + result + "개");
//	}
//	
	
	
//	5. 배열에서 특정 숫자의 위치 찾기
//	💡 "정수 배열과 특정 숫자를 입력받아서, 그 숫자가 배열의 몇 번째 인덱스에 있는지 반환하는 메서드를 작성하시오."
//
//	✔ 메서드 이름: findIndex
//	✔ 매개변수: int[] arr, int targetNumber
//	✔ 반환값: targetNumber가 있는 인덱스(위치)
//	✔ 만약 배열에 숫자가 없으면 -1을 반환할 것
//	✔ main에서 실행하여 결과를 출력할 것
	
//	public int findIndex(int[]arr, int targetNumber) {
//		int result = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == targetNumber) { // 찾으면
////				result = arr[i];
//				return i; // 바로 반환
////			}else {
////				result = -1;
//			}
//		}
////		return result;
//		return -1;	// 끝까지 없으면 -1 반환
//	}
//	public static void main(String[] args) {
//		MethodTest mt = new MethodTest();
//		int [] arr = {2,4,5,6};
//		int arrNum = 4;
//		int result = mt.findIndex(arr, arrNum);
//		System.out.println("찾는 숫자 : " + arrNum + ", 숫자의 위치 : "+ result);
//	}

	
	
//	6. 배열에서 가장 작은 숫자 찾기
//	💡 "정수 배열을 받아서, 배열 안에서 가장 작은 숫자를 찾아 반환하는 메서드를 작성하시오."
//
//	✔ 메서드 이름: findMin
//	✔ 매개변수: int[] arr (정수 배열)
//	✔ 반환값: 배열 안에서 가장 작은 숫자
//	✔ 메인 메서드에서 findMin을 실행하고 결과를 출력할 것
	
//	public int findMin(int[]arr) {
//		int min = arr[0];
////		int result = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < min) {
////				result++;
//				min = arr[i];
//			}
//		}
////		return result;
//		return min;
//	}
//	
//	public static void main(String[] args) {
//		MethodTest mt = new MethodTest();
////		int [] arr = {1,100,20,99};
//		int [] arr = {1,100,20,-99};
//		
//		int result = mt.findMin(arr);
//		System.out.println("가장 작은 수 : " + result);
//	}
	
	
	
	
	
//	7.배열에서 가장 자주 등장하는 숫자 찾기
	
//	배열 안에서 가장 많이 등장하는 숫자를 찾아 반환
//	만약 여러 개가 있다면 그 중 하나만 반환하면 됨
//	배열이 비어 있으면, -1을 반환하도록 하라
	
//	public int array1(int[] arr1) {
////		int count = 0;
//		int maxCount = 0; // 가장 많이 등장한 횟수
//		int mostNum = arr1[0]; // 가장 많이 등장한 숫자
//		
//		for(int i = 0; i < arr1.length; i++) { // 배열의 각 숫자 (하나의 숫자를 선택)
//			int count = 0;
//			
//			for( int j = 0; j < arr1.length; j++) { // 배열을 다시 돌며 숫자 등장 횟수 
//													// (그 숫자가 배열에서 몇 번 등장하는지 확인)
//				if(arr1[i] == arr1[j]) {
//					count++;
//				}				
//			}
//			
//			if(count > maxCount) { // 최댓값
//				maxCount = count;
//				mostNum = arr1[i];
//			}	
//		}
//		return mostNum; // 가장 많이 등장한 숫자
//	}
//	
//	
//	public static void main(String[] args) {
//		MethodTest mt = new MethodTest();
//		int[] arrNums = {1,2,2,2,3};
//		int result = mt.array1(arrNums);
//		System.out.println(result);
//	}
	
		
}
