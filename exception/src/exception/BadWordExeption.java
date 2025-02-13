package exception;

// 예외 만들기

public class BadWordExeption extends RuntimeException{
	public BadWordExeption() {;}
	
	public BadWordExeption(String message) {
		super(message);
	}
}
