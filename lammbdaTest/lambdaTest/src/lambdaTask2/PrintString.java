package lambdaTask2;

@FunctionalInterface
public interface PrintString { // 문자열과 문자 하나를 받아서 개수 반환
	public int strCount(String content, char c);
}
