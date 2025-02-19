package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		simpleDateFormat.format(date);
		
		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
//		simpleDateFormat.parse("1900년 12월 4일"); // 예외처리를 강제하는 문
		
		try {
			simpleDateFormat.parse("1900년 12월 4일");
			System.out.println(simpleDateFormat.parse("1900년 12월 4일"));
		} catch (ParseException e) {
			e.printStackTrace();
		} // 예외처리를 강제하는 문
	}

}
