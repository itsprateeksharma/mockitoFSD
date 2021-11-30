package newfeatures;

import java.util.Base64;
import java.util.Scanner;

//java program to encrypt & decrypt data
public class Base64Demo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String userName,password;
		
		System.out.println("Welcome to coforge tecghnologies!");
		System.out.println("Enter name: ");
		userName=s.next();
		
		System.out.println("Enter Password: ");
		password=s.next();
		
		//encoding the byte string to base64 format
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("Login Successful!");
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+encodedPassword);
		
		//decode base64 format to byteArray
		System.out.println("----Decrypt the Password----");
		
		//decode base64 format to String
		String decodePassword =new String(Base64.getDecoder().decode(encodedPassword));
		
		System.out.println("the password is : "+decodePassword);
		
		System.out.println("--------Url Encoding--------");
		Base64.Encoder encoder= Base64.getUrlEncoder();
		String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		
		System.out.println("Encode Url: "+eUrl);
		
		
	}

}
