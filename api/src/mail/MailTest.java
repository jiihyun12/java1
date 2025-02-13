package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

// 메일을 전송하는 메서드로 만들고,
// 팀원들에게 반복문으로 모두 메일 발송시키기



public class MailTest {
	
	 public static void main(String[] args) {
	        String[] teamEmails = {"alsdk6761@gmail.com"};
	        
	        for (String toEmail : teamEmails) {
	            sendEmail(toEmail);
	        }
	    }
	    
	    public static void sendEmail(String toEmail) {
	        final String bodyEncoding = "UTF-8";
	        String subject = "꺅둥";
	        String fromEmail = "j22h.h0h@gmail.com";
	        String fromUsername = "히히";
	        final String username = "j22h.h0h@gmail.com";
	        final String password = "mavd sgrr jzpg kfgj";
	        
	        String html = "<h3>대천재 미나</h3>";
	        
	        Properties props = new Properties();    
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        
	        try {
	            Authenticator auth = new Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            };
	            
	            Session session = Session.getDefaultInstance(props, auth);
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(fromEmail, fromUsername));
	            message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	            message.setSubject(subject);
	            message.setSentDate(new Date());
	            
	            Multipart mParts = new MimeMultipart();
	            MimeBodyPart mTextPart = new MimeBodyPart();
	            mTextPart.setText(html, bodyEncoding, "html");
	            mParts.addBodyPart(mTextPart);
	            
	            message.setContent(mParts);
	            Transport.send(message);
	            
	            System.out.println("메일을 성공적으로 보냈습니다: " + toEmail);
	        } catch (Exception e) {
	            e.printStackTrace();
        }
	}
}
