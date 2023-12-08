package view;

import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaLogin extends TelaPadrao{
	
	public TelaLogin() {
		
		adicionarTituloTela("login", 430, 200, 250, 110);
		textEmail();
		textSenha();
		labelEmail();
		labelSenha();
		criarImagen();
		botaoCadastro();
		botaoRecuperarSenha();
		botaoEntrar();
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
		
		ImageIcon imagem= new ImageIcon("Business/Imagens/iconBasementParts.png", "");
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(150, 150,java.awt.Image.SCALE_SMOOTH);
		imagem= new ImageIcon(newimg);
		
		JLabel logo= new JLabel("");
		logo.setBounds(380, 70, 150, 150);
		logo.setIcon(imagem);
		logo.setVisible(true);
		add(logo);
		
	}
	
	public void botaoCadastro() {
		
		JButton botao= new JButton("Cadastre-se");
		botao.setBounds(460, 500, 130, 60);
		botao.setVisible(true);
		add(botao);
		
	}
	
	public void botaoRecuperarSenha() {
		
		JButton botao = new JButton("Recuperar senha");
		botao.setBounds(300, 500, 130, 60);
		botao.setVisible(true);
		add(botao);
	}
	
	public void botaoEntrar() {
		
		JButton botao= new JButton("Entrar");
		botao.setBounds(410, 435, 80, 50);
		botao.setVisible(true);
		add(botao);
	}
	
	public static void main(String[]args) {
		
		new TelaLogin();
	}

}
