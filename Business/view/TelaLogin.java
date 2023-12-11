package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.AdmControl;
import dto.AdmDTO;
import fabricas.Button;
import fabricas.CriarImagem;
import fabricas.Texto;
import fabricas.iLabel;
import model.AdmModel;
import model.EnvioEmail;
import model.GerarSenhaAleatoria;


public class TelaLogin extends TelaPadrao{
	
	private AdmControl controle = AdmControl.getAdmControl();
	private JButton botaoRecuperar;
	private AdmControl admControl;
	private AdmModel admModel;
	private JButton botaoVoltar;
	private JTextField email;
	private JTextField senha;
	private JButton botaoEntrar;
	private AdmDTO admDTO;
	
	
	public TelaLogin() {
		
		adicionarTituloTela("login", 430, 200, 250, 110);
		textEmail();
		textSenha();
		labelEmail();
		labelSenha();
		criarImagen();
		botaoVoltar();
		botaoRecuperarSenha();
		botaoEntrar();
		ouvintes();
		setVisible(true);
	}
	
	
	public void textEmail() {
		
		Texto texto= Texto.getTexto();
		email= texto.produzir("",250, 310, 400, 35);
		
		email.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				email.setForeground(Color.BLACK);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				if(email.getText().equals("")) {
					
					email.setFont(new Font("Tohama", Font.PLAIN, 11));
					email.setForeground(Color.RED);
					email.setText("Preenchimento obrigatório!");
				}
			}
		});
		
		add(email);
	}
	
	public void textSenha() {
		
		Texto texto= Texto.getTexto();
		senha= texto.produzir("", 250, 390, 400, 35);
		
		senha.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				senha.setForeground(Color.BLACK);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				senha.setFont(new Font("Tohama", Font.PLAIN, 11));
				senha.setForeground(Color.RED);
				senha.setText("preenchimento obrigatório!");
			}
		});
		
		add(senha);
	}
	
	public void labelEmail() {
	
		iLabel labelS= iLabel.getLabel();
		JLabel label= labelS.produzir("E-mail",140, 320, 200, 20);
		add(label);
	}
	
	public void labelSenha() {
				
		iLabel l= iLabel.getLabel();
		JLabel label= l.produzir("Senha: ", 138, 400, 200, 20);
		add(label);
	}
	
	public void criarImagen() {
		
		
		CriarImagem criar= CriarImagem.getCriarImagem();
		ImageIcon imagem= criar.produzir("Business/Imagens/iconBasementParts.png",150,150, 0, 0);
		
		iLabel label= iLabel.getLabel();
		JLabel logo= label.produzir("", 380, 70, 150, 150);
		logo.setIcon(imagem);
		add(logo);
		
	}
	
	public void botaoVoltar() {
		
		Button b= Button.getButton();
		botaoVoltar = b.produzir("Voltar", 460, 500, 130, 60);
		add(botaoVoltar);
		
	}
	
	public void botaoRecuperarSenha() {
		
		Button b= Button.getButton();
		botaoRecuperar= b.produzir("Recuperar senha", 300, 500, 130, 60);
		add(botaoRecuperar);
	}
	
	public void botaoEntrar() {
		
		Button b= Button.getButton();
		botaoEntrar= b.produzir("Entrar",410, 435, 80, 50);
		add(botaoEntrar);
	}
	
	public void ouvintes() {
		
		
		
		botaoEntrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String textEmail= email.getText();
				String textSenha= senha.getText();
				
				if (!textEmail.equals("") && !textSenha.equals("")) {
					if(controle.isLogin(new AdmDTO(textEmail, textSenha))) {
						JOptionPane.showMessageDialog(rootPane, "Bem vindo");
						new TelaMenu();
						dispose();
					}
				}else {
					
					JOptionPane.showMessageDialog(null, "Preencha os campos", "", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		botaoRecuperar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String senhaNova= GerarSenhaAleatoria.gerarCodigo();
				//EnvioEmail.enviarEmail(email.getText(), senhaNova);
				
				admControl.saveControll(new AdmDTO(email.getText(), senhaNova));// colocar nova senha
				
			}
		});
		
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
	}
	
	public static void main(String[]args) {
		
		new TelaLogin();
	}

}
