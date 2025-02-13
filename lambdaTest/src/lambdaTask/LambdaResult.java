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



  

       
        
        
 
