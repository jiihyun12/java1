//package collectionTest.arrayList.task;
//
//public class Login {
//	public static void main(String[] args) {
//		UserField userField = new UserField();
//		
//		// 단위 테스트
//		User user = new User();
//		user.setId("hjh1234");
//		user.setPassword("1234");
//		
//		System.out.println(user);
//		
//		if(userField.checkId(user.getId()) == null) {
//			userField.join(user);
//			
//			System.out.println(DBConnecter.users);
//		}
//		
//		User userForLogin = new User();
//		userForLogin.setId("hjh1234");
//		userForLogin.setPassword("1234");
//		if(userField.login(userForLogin)) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
//		
//		// 로그인 후 session대신 사용한 static필드에 userId로 접근한다.
//		System.out.println(UserField.userId);
//		
//		User foundUser = userField.checkId(userField.userId);
//		setField.update(foundUser);
//		
//		userField.logout();
//		
////		userForLogin = new User();
////		userForLogin.set
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//		
//		
//		
//	}
//	
//}
