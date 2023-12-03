package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarEmail {

	public static boolean emailValidatorP(String email){
		
		 String regx = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regx);
		 Matcher matcher = pattern.matcher(email);
		 
      return matcher.matches();
  }
}
