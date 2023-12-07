package msg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CollageCadastroVerifiction extends MsgCollage {

	public CollageCadastroVerifiction(Mediator m) {
		super(m);
	}

	@Override
	public void receberMsg(Object objectMsg,String dados) {
		eMailMsg(dados);
	}	
	
	
	
	private boolean emailValidatorP(String email){
		
		 String regx = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regx);
		 Matcher matcher = pattern.matcher(email);
		 
      return matcher.matches();
  }

	private void eMailMsg(String email) {
		if(emailValidatorP(email)) {
			JOptionPane.showMessageDialog(this, "Email nao valido, veja se tem {@} ou {.com}");
		}
	}
	
	
	
}


