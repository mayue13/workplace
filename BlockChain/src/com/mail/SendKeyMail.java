package com.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendKeyMail {
	
	public static void SecretKeySend(String email,String secretKey)
	{
		
		
//		 String result;
	
		 	Properties props = System.getProperties();
	        String host = "smtp.gmail.com";
	        String from = "yourcloudbackup@gmail.com";
	        String pass = "ogkirve007@";
	        String to = email;
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.user", from);
	        props.put("mail.smtp.password", pass);
	        props.put("mail.smtp.port", "587");     
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.timeout", "25000");
	        Session mailsession = Session.getDefaultInstance(props);
	   
	   try
	   {
	        MimeMessage message = new MimeMessage(mailsession);       
	        message.setFrom(new InternetAddress(from));   
	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	      
	        
	        
	        	message.setSubject("OTP Code");
		        message.setText("Your login OTP Code is: "+secretKey+"\nPlease don't share with anyone");
		        	
	       // }
	        Transport transport = mailsession.getTransport("smtp");
	        transport.connect(host, from, pass);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
//	        result = "Message sent successfully....check your registered  Mail ID";
	      
	       
	    }catch (MessagingException mex) {
	      mex.printStackTrace();
	     // result = "Error: unable to send message....";
	    }
		 }  
	
	public static void SecretReject(String email,String msg)
	{
		
		
//		 String result;
	
		 	Properties props = System.getProperties();
	        String host = "smtp.gmail.com";
	        String from = "yourcloudbackup@gmail.com";
	        String pass = "ogkirve007@";
	        String to = email;
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.user", from);
	        props.put("mail.smtp.password", pass);
	        props.put("mail.smtp.port", "587");     
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.timeout", "25000");
	        Session mailsession = Session.getDefaultInstance(props);
	   
	   try
	   {
	        MimeMessage message = new MimeMessage(mailsession);       
	        message.setFrom(new InternetAddress(from));   
	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	      
	        
	        
	        	message.setSubject("Your Profile "+msg);
		        message.setText("Your Profile"+msg);
		        	
	       // }
	        Transport transport = mailsession.getTransport("smtp");
	        transport.connect(host, from, pass);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
//	        result = "Message sent successfully....check your registered  Mail ID";
	      
	       
	    }catch (MessagingException mex) {
	      mex.printStackTrace();
	     // result = "Error: unable to send message....";
	    }
		 }

}
