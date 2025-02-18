package collectionTest.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HachMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>();
		userMap.put("id", "hgh1234"); // put --> 추가
		userMap.put("password", "1234"); 
		userMap.put("name", "홍길동");
		userMap.put("id", "hgh1234"); 

		System.out.println(userMap.size());
		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		entry : key, value를 한 쌍씩 가지고 있는 자료 구조
//		entrySet() : Set자료구조로 바꾼다.
//		순서가 없기 때문에 iterator()
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			System.out.println(entry);
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			};
		}
		
		}
}
