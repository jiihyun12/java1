package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String,Object>();
		userMap.put("id", "hjh1234");
		userMap.put("password", "hjh1234");
		userMap.put("name", "홍길동");
		userMap.put("age", 20);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
