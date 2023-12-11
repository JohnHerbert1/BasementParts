package msg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CollageCadastroVerifiction extends MsgCollage {

	public CollageCadastroVerifiction(Mediator m) {
		super(m);
	}


	@Override
	public void catchMsg(Object objectMsg, String dadosString) {
		JOptionPane.showMessageDialog(null, "Email nao qualificado ao Cadastro precisa ter {@} {.com}","Erro",JOptionPane.ERROR_MESSAGE);
	}


	public static boolean emailValidatorP(String email){
		
		 String regx = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regx);
		 Matcher matcher = pattern.matcher(email);
		 
     return matcher.matches();
 }

	
	@Override
	public boolean catchResponsability(String email) {
		if(emailValidatorP(email) == false) { 
			return false;
		}
		return true;
	}

	
	
}


