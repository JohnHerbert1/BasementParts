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
import model.AdmModel;


public class TelaLogin extends TelaPadrao{
	
	private JButton botaoRecuperar;
	private AdmControl admControl;
	private AdmModel admModel;
	private JButton botaoCadastrar;
	private JTextField email;
	private JTextField senha;
	private JButton botaoEntrar;
	
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
		ouvinteEntrar();
		setVisible(true);
	}
	
	
	public void textEmail() {
		
		email= new JTextField();
		email.setBounds(250, 310, 400, 35);
		email.setVisible(true);
		
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
		
		senha= new JTextField();
		senha.setBounds(250, 390, 400, 35);
		senha.setVisible(true);
		
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
		
		botaoRecuperar = new JButton("Recuperar senha");
		botaoRecuperar.setBounds(300, 500, 130, 60);
		botaoRecuperar.setVisible(true);
		add(botaoRecuperar);
	}
	
	public void botaoEntrar() {
		
		botaoEntrar= new JButton("Entrar");
		botaoEntrar.setBounds(410, 435, 80, 50);
		botaoEntrar.setVisible(true);
		add(botaoEntrar);
	}
	
	public void ouvinteEntrar() {
		
		
		botaoEntrar.addActionListener(new ActionListener() {
			
			AdmControl controle = AdmControl.getAdmControl();
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				String textEmail= email.getText();
				String textSenha= senha.getText();
				
			//	if (controle.) {
						JOptionPane.showConfirmDialog(null, "Deu certo", "", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
					
		});
		
	}
	
	public static void main(String[]args) {
		
		new TelaLogin();
	}

}
