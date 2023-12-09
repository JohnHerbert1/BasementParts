package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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

public class TelaCadastroADM extends TelaPadrao{

	
	private AdmControl admControl;
	private AdmModel admModel;
	private JButton botaoCadastrar;
	private JTextField email;
	private JTextField senha;
	
	
	public TelaCadastroADM() {

		
		adicionarTituloTela("Cadastro de Administrador",  320, 200, 300, 90);
		textEmail();
		textSenha();
		labelEmail();
		labelSenha();
		criarImagen();
		botao();
		ouvinteCadastrar();
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
					email.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
				
				senha.setForeground(Color.black);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(senha.getText().equals("")) {
					senha.setFont(new Font("Tahoma", Font.PLAIN, 11));
					senha.setForeground(Color.RED);
					senha.setText("Preenchimento obrigatório!");
				}
				
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
	
	public void botao() {

	
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(330, 450, 100, 50);
		botaoCadastrar.setVisible(true);
		add(botaoCadastrar);
			
		JButton fechar= new JButton("Voltar");
		fechar.setBounds(480, 450, 100, 50);
		fechar.setVisible(true);
		add(fechar);
		
	}
	
	public void ouvinteCadastrar() {

		admModel= new AdmModel();
		admControl= AdmControl.getAdmControl(admModel);
		
		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String textEmail = email.getText();
				String textSenha= senha.getText();
				
				if(!textEmail.equals("") && !textSenha.equals("")) {// pq email esta apagando as informações ? consertar depois
					
					admControl.saveControll(new AdmDTO(textEmail, textSenha));
					JOptionPane.showMessageDialog(null, "Seja Bem Vindo", "", JOptionPane.OK_OPTION);
					dispose();
					new TelaLogin();
						
				} else {
				
					JOptionPane.showMessageDialog(null, "Preencha os campos para cadastrar", "Erro", JOptionPane.ERROR_MESSAGE);	
				}
			}
		});
		
	}
	
	
	public static void main(String[]args) {

		
		new TelaCadastroADM();
	}
}
