package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//		1번 문제
//		num1 + str1 + str2로 115만들기
		int num11 = 1;
		String str1 = "8.24", str2 = "7.8";
		
		double strD1 = Double.parseDouble(str1);
		double strD2 = Double.parseDouble(str2);
		System.out.printf("%s",num11);
		System.out.println((int)strD1 + (int)strD2);
		
		
	
		
//      2번 문제
//      a, j, k를 연산하여 A, J, K를 출력하기
		
//      System.out.print((char)65);
//      System.out.print(",");
//      System.out.print((char)74);
//      System.out.print(",");
//      System.out.println((char)75);

//		강사님 풀이 :
		char a = 'a', b = 'b', c = 'c';
		int gap = 'a' - 'A';
		String result2 = "%c, %c, %c\n";
		
		a = (char)(a - gap);
		b = (char)(b - gap);
		c = (char)(c - gap);
		
		System.out.printf(result2, a, b, c);
      
      
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
//      int num1 = (int)12.123;
//      int num2 = (int)345.789;
//      int num3 = (int)6789.456;
//      System.out.printf("%S", num1);
//      System.out.printf("%S", num2);
//      System.out.printf("%S", num3);
//	}
//}

		// 강사님 풀이
		String str4 = "12.123", str5 = "345.789", str6 = "6789.456", result3 = "";
		int num4 = 0, num5 = 0, num6 = 0;
		
		num4 = (int)Double.parseDouble(str4);
		num5 = (int)Double.parseDouble(str5);
		num6 = (int)Double.parseDouble(str6);
		
		result3 += num4;
		result3 += num5;
		result3 += num6;
		
		System.out.println(result3);
		
	}
	
}