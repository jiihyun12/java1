package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
//		회원가입
//		if(memberDAO.checkId("hjh1234")) {
//			System.out.println("사용 가능한 아이디");
//			memberVO.setMemderid("hjh1234");
//			memberVO.setMemberPassword("1234");
//			memberVO.setMemberName("함지현");
//			memberVO.setMemberAddress("경기도 남양주시");
//		}else {
//			System.out.println("중복된 아이디");
//		}		
//		memberDAO.join(memberVO);
		
		
//		로그인
//		memberVO.setMemderid("hjh1234");
//		memberVO.setMemberPassword("1234");
//		
//		if(memberDAO.Login(memberVO)) {
//			System.out.println("로그인에 실패하였습니다.");
//		}else {
//			System.out.println(memberDAO.session);
//			System.out.println("로그인이 완료되었습니다.");
//		}
		
		
//      정보수정
      MemberVO updatedMember = new MemberVO();
      updatedMember.setMemderid("hgd12345");
      updatedMember.setMemberPassword("12345");
      updatedMember.setMemberName("홍길동");
      updatedMember.setMemberAddress("서울시 강남구");
      
      memberDAO.update(updatedMember);
      System.out.println("수정 완료");
      
//     비밀번호 변호 변경
      MemberVO updatePassword = new MemberVO();
  
      
      
//      회원 탈퇴
      
//      memberDAO 
		
		
	}
}
