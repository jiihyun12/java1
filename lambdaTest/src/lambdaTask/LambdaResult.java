package lambdaTask;

public class LambdaResult {
    public static void main(String[] args) {
        // 람다식 인터페이스
    	// 타입을 생략해도 인식이 된다.
        PrintName printName = (firstName, lastName) -> firstName + lastName;

        // 출력
        System.out.println(printName.printName("함", "지현"));
    }
}













  

       
        
        
        // 첫 번째 숫자가 음수인지 확인 및 처리
        int result;
        int index = 0;
        if (tokens[0].equals("-")) { // 첫 번째 숫자가 음수일 경우
            result = Integer.parseInt(tokens[0] + tokens[1]); // "-9" 같은 값 처리
            index = 2; // 다음 연산자로 이동
        } else {
            result = Integer.parseInt(tokens[0]);
            index = 1; // 다음 연산자로 이동
        }

        // 계산 실행
        while (index < tokens.length - 1) {
            String operator = tokens[index]; // 연산자
            int nextNumber = Integer.parseInt(tokens[index + 1]); // 피연산자

            // 람다식을 통한 연산 수행
            Calc operation = calculator(operator);
            result = operation.calc(result, nextNumber);

            index += 2; // 다음 연산자로 이동
        }

        // 결과 출력
        System.out.println("결과: " + result);
    }
}
