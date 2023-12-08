package view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroADM extends TelaPadrao{

	
	public TelaCadastroADM() {
		
		adicionarTituloTela("Cadastro de Administrador",  320, 200, 300, 90);
		textEmail();
		textSenha();
		labelEmail();
		labelSenha();
		criarImagen();
		botaoCadastrar();
		setVisible(true);
	}
	
	public void textEmail() {
		
		JTextField email= new JTextField();
		email.setBounds(250, 310, 400, 35);
		email.setVisible(true);
		add(email);
	}
	
	public void textSenha() {
		
		JTextField senha= new JTextField();
		senha.setBounds(250, 390, 400, 35);
		senha.setVisible(true);
		add(senha);
	}
	
	public void labelEmail() {
	
		JLabel label= new JLabel("E-mail:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(140, 320, 200, 20);
		label.setVisible(true);
		add(label);
	}
	
	public void labelSenha() {
		
		JLabel label= new JLabel("Senha: ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(138, 400, 200, 20);
		label.setVisible(true);
		add(label);
	}
	
	public void criarImagen() {
		
		ImageIcon imagem= new ImageIcon("Business/Imagens/loginProjeto.png", "");
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(150, 150,java.awt.Image.SCALE_SMOOTH);
		imagem= new ImageIcon(newimg);
		
		JLabel logo= new JLabel("");
		logo.setBounds(380, 70, 150, 150);
		logo.setIcon(imagem);
		logo.setVisible(true);
		add(logo);
		
	}
	
	public void botaoCadastrar() {
	
		
		JButton cadastrar= new JButton("Cadastrar");
		cadastrar.setBounds(330, 450, 100, 50);
		cadastrar.setVisible(true);
		add(cadastrar);
			
		JButton fechar= new JButton("Voltar");
		fechar.setBounds(480, 450, 100, 50);
		fechar.setVisible(true);
		add(fechar);
		
	}
	
	
	public static void main(String[]args) {
		
		new TelaCadastroADM();
	}
}
