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
import fabricas.Fabrica;
import fabricas.Texto;
import fabricas.iLabel;
import model.AdmModel;

public class TelaCadastroADM extends TelaPadrao{

	
	private AdmControl admControl = AdmControl.getAdmControl();
	private JButton botaoCadastrar;
	private JTextField email;
	private JTextField senha;
	private JButton fechar;
	
	
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

		
		Texto texto = Texto.getTexto();
		email= texto.produzir("", 250, 310, 400, 35);
		
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
		
		Texto texto= Texto.getTexto();
		senha= texto.produzir("", 250, 390, 400, 35);
		
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
		
		iLabel labelS= iLabel.getLabel();
		JLabel label= labelS.produzir("E-mail: ", 140, 320, 200, 20);
		add(label);
	}
	
	public void labelSenha() {

			
		iLabel labelS= iLabel.getLabel();
		JLabel label= labelS.produzir("Senha: ", 138, 400, 200, 20);
		add(label);
	}
	
	public void criarImagen() {
		
		CriarImagem i= CriarImagem.getCriarImagem();
		ImageIcon imagem= i.produzir("Business/Imagens/iconBasementParts.png", 150, 150, 0, 0);
		
		iLabel label= iLabel.getLabel();
		JLabel logo= label.produzir("", 380, 70, 150, 150);
		logo.setIcon(imagem);
		add(logo);
		
	}
	
	public void botao() {
		
		Button botao= Button.getButton();
		botaoCadastrar = botao.produzir("Cadastrar",330, 450, 100, 50);
		add(botaoCadastrar);
			
		
		
		Button botaoF= Button.getButton();
		fechar= botaoF.produzir("Voltar", 480, 450, 100, 50);
		add(fechar);
		
	}
	
	public void ouvinteCadastrar() {

		
		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String textEmail = email.getText();
				String textSenha= senha.getText();
				
				if(!textEmail.equals("") && !textSenha.equals("")) {
					
					admControl.saveControll(new AdmDTO(textEmail, textSenha));
					JOptionPane.showMessageDialog(null, "Seja Bem Vindo", "", JOptionPane.OK_OPTION);
					dispose();
					new TelaLogin();
						
				} else {
				
					JOptionPane.showMessageDialog(null, "Preencha os campos para cadastrar", "Erro", JOptionPane.ERROR_MESSAGE);	
				}
			}
		});
		
		fechar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
	}
	
	
	public static void main(String[]args) {

		
		new TelaCadastroADM();
	}
}
