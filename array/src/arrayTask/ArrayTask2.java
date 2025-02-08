package arrayTask;
//
import java.util.Scanner;
//
public class ArrayTask2 {
	public static void main(String[] args) {
		
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      
//      .charAt()
//      단 문자열의 메서드는 사용하지 않는다.
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
		
		
//		1번 답
//		Scanner sc = new Scanner(System.in);
//	      
//	      String message = "텍스트를 입력해주세요.", inputText = null;
//	      char [] inputTextChar = null;
//	      
//	      int numA = (int)'A', numZ = (int)'Z', gap = (int)'a' - (int)'A';
//	      
//	      int count = 0;
//	      
//	      System.out.println(message);
//	      
//	      inputText = sc.nextLine() + (char)0;
//	      while(inputText.charAt(count) != 0) {
//	         
//	         count++;
//	      }
////	      System.out.println(count);
//
//	      inputTextChar = new char[count];
//	      
//	      for(int i = 0; i < count; i++) {
//	         inputTextChar[i] = inputText.charAt(i);
//	         
//	         if((int)inputTextChar[i] >= numA
//	               && (int)inputTextChar[i] <= numZ) {
//	            int changeLetter =  (int)inputTextChar[i] + gap;
//	            inputTextChar[i] = (char)changeLetter;
//	         }
//	         else if((int)inputTextChar[i] >= numA + gap 
//	               && (int)inputTextChar[i] <= numZ + gap) {
//	            
//	            int changeLetter =  (int)inputTextChar[i] - gap;
//	            inputTextChar[i] = (char)changeLetter;
//	         }
//	      }
//	      
//	      for(int i = 0; i < count; i++) {
//	         System.out.print(inputTextChar[i]);
//	      }

	      
	      
	      
		
//      2) 정수를 한글로 변경
//		입력한 값을 배열에 담고 
//      입력 예) 1024
//      출력 예) 일공이사

//		사용자가 입력한 정수가 


//		char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		int length = 0;
		
		
//		int[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		char[] hangles = {'공','일','이','삼','사','오','육','칠','팔','구'};
//		String input = "";
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		String message = "정수를 입력하세요 ex) 1234";
//		
//		System.out.println(message);
//		input = sc.nextLine();
		
//		for(int i = 0; i <= input.length(); i++) {
//			for(int j = 0; j < 10; j++) {
//				if(input.charAt(i) == numbers[j]) {
//					System.out.print(hangles[j]);	
		
//		inputText = sc.nextLine() + (char)0;
//	      while(inputText.charAt(count) != 0) {
//	         
//	         count++;
//	      }
////	      System.out.println(count);
//
//	      inputTextChar = new char[count];
//		
//		
//				}		
//			}
//		}
		
//
//	        
//		        int length = 0;
//
//		        for (char c : str) {  
//		            length++;
//		        }
//
//		        System.out.println( length  );
//		       
//		    }
//		}

//	      2번 답
//	      String word = "";
//	      int textLength = 0;
//	        String message2 = "정수를 입력해주세요. ex)1024";
////	        Scanner sc = new Scanner(System.in);
//	        
//	        System.out.println(message);
//	   
//	        word = sc.nextLine() + (char)0;
//	        while(word.charAt(textLength) != 0) {
//	           
//	           textLength++;
//	        }
//
//	      
//	        int[] arr = new int[textLength];
//	        char[] hangle = new char[textLength]; 
//	        
//	        for (int i = 0; i < textLength; i++) {
//	           arr[i] = word.charAt(i);
//	        }
//	        
//	        for (int i = 0; i < textLength; i++) {
//	           switch(arr[i]) {
//	              case '0':
//	                 hangle[i] = '공';
//	                 break;
//	              case '1':
//	                 hangle[i] = '일';
//	                 break;
//	              case '2':
//	                 hangle[i] = '이';
//	                 break;
//	              case '3':
//	                 hangle[i] = '삼';
//	                 break;
//	              case '4':
//	                 hangle[i] = '사';
//	                 break;
//	              case '5':
//	                 hangle[i] = '오';
//	                 break;
//	              case '6':
//	                 hangle[i] = '육';
//	                 break;
//	              case '7':
//	                 hangle[i] = '칠';
//	                 break;
//	              case '8':
//	                 hangle[i] = '팔';
//	                 break;
//	              case '9':
//	                 hangle[i] = '구';
//	                 break;
//	           }        
//	        }
//	        for (int i = 0; i < textLength; i++) {
//	            switch(arr[i]) {
//	               case '공':
//	                  hangle[i] = '0';
//	                  break;
//	               case '일':
//	                  hangle[i] = '1';
//	                  break;
//	               case '이':
//	                  hangle[i] = '2';
//	                  break;
//	               case '삼':
//	                  hangle[i] = '3';
//	                  break;
//	               case '사':
//	                  hangle[i] = '4';
//	                  break;
//	               case '오':
//	                  hangle[i] = '5';
//	                  break;
//	               case '육':
//	                  hangle[i] = '6';
//	                  break;
//	               case '칠':
//	                  hangle[i] = '7';
//	                  break;
//	               case '팔':
//	                  hangle[i] = '8';
//	                  break;
//	               case '구':
//	                  hangle[i] = '9';
//	                  break;
//	            }        
//	         }
//	        
//	        for (int i = 0; i < textLength; i++) {
//	           System.out.print(hangle[i]);
//	        }
//		
	
		
		
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
					
//					3번 답
					
//					System.out.println("입력: ");
//
//				      String word2 = sc.nextLine() + (char)0;
//				      int count1 =0;
//				      while(word2.charAt(count1) != 0) {
//				               
//				          count1++;
//				      }
//				      
//				      String findWord = sc.next();
//				      System.out.println("찾을 문자 : " + findWord);
//				      int num = count1;
//
//				      char[] arr2 = new char[num];
//				      int cnt =0;
//				      
//				      for(int i=0; i<num; i++)
//				      {
//				         arr2[i] = word2.charAt(i);
//				         if(arr2[i] == findWord.charAt(0))
//				         {
//				            cnt++;
//				         }
//				      }
//				      System.out.println(findWord + "의 개수" + cnt + "개");

//	}
//}


// 강사님 풀이 ===========================================================================
//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask2 {
//   public static void main(String[] args) {
//      힌트 배열의 '열'은 나열
      
//      chatGPT X 검색 X
//      .charAt()
//      단 문자열의 메서드는 사용하지 않는다.
      
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
//      Scanner sc = new Scanner(System.in);
//      String input = null, message = "대소문자를 바꿀 문자열을 입력하세요.", result = "";
//      char[] arr1 = null;
//      int count = 0, gap = 32;
//      
//      System.out.println(message);
//      input = sc.nextLine();
//      
//      while(true) {
//         try {
//            input.charAt(count);
//            count++;
//         } catch (Exception e) {
//            break;
//         }
//      }
//      
//      arr1 = new char[count];
      
//      배열에 input값을 추가하기
//      for(int i = 0; i < count; i ++) {
//         arr1[i] = input.charAt(i);
//      }
      
//      arr1 = input.toCharArray();
      
//      for(int i = 0; i < arr1.length; i++) {
//         char c = arr1[i];
//         if(c >= 65 && c <= 90) {
//            result += (char)(c + gap);
//         }else if(c >= 97 && c <= 122) {
//            result += (char)(c - gap);
//         }else{
//            result += c;
//         }
//      }
//      
//      System.out.println(result);
      
//
//      2) 정수를 한글로 변경
//      - 입력 값을 배열에 담고 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사

//      String input2 = null, message2 = "한글로 바꿀 1~9까지의 정수를 입력하세요.\nex)1024", result2 = "",
//            hangle = "공일이삼사오육칠팔구";
//      int[] arr2 = null;
//      int count2 = 0;
//      
//      System.out.println(message2);
//      input2 = sc.next();
//      
//      while(true) {
//         try {
//            input2.charAt(count2);
//            count2++;
//         } catch (Exception e) {
//            break;
//         }
//      }
//      
//      arr2 = new int[count2];
//      
//      for(int i = 0; i < arr2.length; i++) {
//         arr2[i] = input2.charAt(i) - 48;
//         result2 += hangle.charAt(arr2[i]);
//      }
//      
//      System.out.println(result2);
      
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을 문자 : c
//          c의 개수 3개

//      String input3 = null, message3 = "전체 문장을 입력해주세요.",
//            message4 = "찾을 문자 1개를 입력하세요.\nex)e", result3 = "";
//      char find = ' ';
//      char[] arr3 = null;
//      int count3 = 0, foundCount = 0;
//      
//      System.out.println(message3);
//      input3 = sc.nextLine();
//      
//      System.out.println(message4);
//      find = sc.nextLine().charAt(0);
//      
//      while(true) {
//         try {
//            input3.charAt(count3);
//            count3++;
//         } catch (Exception e) {
//            break;
//         }
//      }
//
//      arr3 = new char[count3];
//      
//      for(int i = 0; i < arr3.length; i++) {
//         arr3[i] = input3.charAt(i);
//      }
//      
//      for(int i = 0; i < arr3.length; i++) {
//         if(arr3[i] == find) {
//            foundCount++;
//         }
//      }
//      
//      System.out.println("전체 문장: " + input3 + "\n찾으려고 하는 문자: " + find + "\n문자의 개수: " + foundCount);
//
//
   
// ========================================================================================      
//   과제 :  메서드를 사용해서 간결하게 풀어보기
      

      
	 }
	}
	     
