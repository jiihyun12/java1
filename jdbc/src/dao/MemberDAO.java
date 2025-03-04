package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import vo.MemberVO;

public class MemberDAO {
	Connection connection;
	PreparedStatement preparedStatement; // 쿼리를 날리기 위한 인터페이스
	ResultSet resultSet; 
	
//	로그인 시 공용 저장소(세션)
	public static Long session;
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER"
				+ "(ID, MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL,? ,? ,? ,?)";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemderid());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setString(4, memberVO.getMemberAddress());
			
			preparedStatement.executeUpdate();
//			preparedStatement.executeQuery(); 
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
			
		}finally {
//			열었던 순서의 반대로 닫는다.
			try {
			if(preparedStatement != null){
				preparedStatement.close();
			} 
			
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
	
//	아이디 중복 검사
	public boolean checkId(String memberId) {
		connection = DBConnecter.getConnect();
		
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ?";
		boolean check = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			resultSet = preparedStatement.executeQuery(); // 결과가 있을 때
			
//			행부터 접근
			resultSet.next();
			
//			있는지 없는지 검사
			resultSet.getLong(1);
			
			
		} catch (SQLException e) {
			check = true;
			e.printStackTrace();
		}finally {
			try {
			if(resultSet != null) {			
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			} 
		}catch (SQLException e) {
					System.out.println("ehcekId 쿼리 실행 후 오류");
					e.printStackTrace();
					throw new RuntimeException();				
					}
			}
		return check;
	}
	
//	로그인
	public boolean Login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
		boolean check = false; // loginfail
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemderid());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			
			session = resultSet.getLong(1);
			
		} catch (SQLException e) {
			check = true;
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {			
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				} 
			}catch (SQLException e) {
					System.out.println("Login 실행 후 오류");
					throw new RuntimeException();
				}
			}
			return check;			
		}
	
	
//	로그아웃
	public void logout() {
		session = null;
		
	}	
	
//  정보 수정
  public void update(MemberVO memberVO) {
     connection = DBConnecter.getConnect();
     String query = "UPDATE TBL_MEMBER SET MEMBER_ID = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ? "
           + "WHERE ID = ?";
     
     System.out.println(memberVO);
     try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, memberVO.getMemderid());
        preparedStatement.setString(2, memberVO.getMemberPassword());
        preparedStatement.setString(3, memberVO.getMemberName());
        preparedStatement.setString(4, memberVO.getMemberAddress());
        preparedStatement.setLong(5, session);
  
        preparedStatement.executeUpdate();
        
     } catch (SQLException e) {
        System.out.println("join(MemberVO) query문 오류");
        e.printStackTrace();
     } finally {
//        열었던 순서의 반대로
        try {
           if(preparedStatement != null) {
              preparedStatement.close();
           }
           
           if(connection != null) {
              connection.close();
           }
           
        } catch (SQLException e) {
           System.out.println("SQL 쿼리 실행 이후 오류 발생");
           e.printStackTrace();
           throw new RuntimeException();
        }
     }
  }
     
//     비밀번호 변경
     public void updatePassword(MemberVO memberVO) {
         connection = DBConnecter.getConnect();
         String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ?"
               + "WHERE ID = ?";
         try {
             preparedStatement = connection.prepareStatement(query);
             preparedStatement.setString(1, memberVO.getMemberPassword());
             preparedStatement.setString(2, memberVO.getMemberName());
             preparedStatement.setString(4, memberVO.getMemberAddress());
             preparedStatement.setLong(5, session);
       
             preparedStatement.executeUpdate();
             
          } catch (SQLException e) {
             System.out.println("join(MemberVO) query문 오류");
             e.printStackTrace();
          } finally {

//             열었던 순서의 반대로
             try {
                if(preparedStatement != null) {
                   preparedStatement.close();
                }
                
                if(connection != null) {
                   connection.close();
                }
                
             } catch (SQLException e) {
                System.out.println("비밀번호 로직 실행 이후 오류 발생");
                e.printStackTrace();
                throw new RuntimeException();
             }
          }
     }
    

     
//     회원 탈퇴
     //  delete쿼리는 실무에서 사용하지 않는다.
//   비밀번호 변경
//   1. 비밀번호 찾기
   public void findPassword(MemberVO memberVO) {
      connection = DBConnecter.getConnect();
      String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE MEMBER_ID = ?";
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberPassword());
         preparedStatement.setLong(2, memberVO.getId());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
   }
   
   
//   2. 새로운 비밀번호 변경
   public boolean checkPassword(String memberPassword) {
      connection = DBConnecter.getConnect();
      String query = "SELECT ID FROM TBL_MEMBER WHERE ID = ? AND MEMBER_PASSWORD = ?";
      boolean check = true;
            
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.setString(2, memberPassword);
         resultSet = preparedStatement.executeQuery();
         resultSet.next();
         resultSet.getLong(1);
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         check = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            System.out.println("checkId 쿼리 실행 후 오류");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return check;
   }
   
//   회원탈퇴
//   soft delete
   public void delete() {
      connection = DBConnecter.getConnect();
      String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
   }
}


	
	
	
	
	


