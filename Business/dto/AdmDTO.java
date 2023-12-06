package dto;

//BASE DE DADOS DO ADM:
public class AdmDTO {
	//O SISTEMA SO PRECISA SABER O EMAIL PARA O ENVIO DO RELATORIO 
	private String eMail;
	private String senha;
	//NAO A ID POIS SO PODERA AVER UMA CONTA ADM CADASTRADA DE FORMA SEPARADA 
	public AdmDTO() {
		
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
