package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest{

   public static void main(String[] args)  throws IOException{
//		파일을 열면 닫는걸 만들어줘야 한다.
	   
//      throws는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//      따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
      
//      new FileWriter(경로, 이어쓰기 여부);
      BufferedWriter bufferedWriter = null;
      try {
         bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));
         bufferedWriter.write(" 함지현 !!");
         bufferedWriter.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         bufferedWriter.close();
      }
      
      BufferedReader bufferedReader = null;
      try {
         bufferedReader = new BufferedReader(new FileReader("text.txt"));
         String line = bufferedReader.readLine();
         while((line = bufferedReader.readLine()) != null) {
        	 System.out.println(line);
         }
         System.out.println(line);
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally{
            bufferedReader.close();
      }
   }
}
