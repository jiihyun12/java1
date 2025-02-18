package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {
	public static void main(String[] args) {
		
		JSONObject userJSON = new JSONObject();
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1, "함지현", 17, "학생");
		User user2 = new User(2, "이순신", 20, "개발자");
		User user3 = new User(3, "홍길동", 50, "요리사");
		User user4 = new User(4, "장보고", 40, "디자이너");
		User user5 = new User(5, "이성계", 137, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
		
		for(User user : users) { 
			JSONObject JSONuser = new JSONObject(user);
			usersJSON.put(JSONuser);
		}
//		System.out.println(users.get(0));

		users.stream().map(JSONObject::new).forEach(usersJSON::put); 
		System.out.println(usersJSON);

		
		
		
	}
}
