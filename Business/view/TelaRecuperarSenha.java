package view;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaRecuperarSenha extends TelaPadrao{

	
	private JTextField textoSenha;
	private JTextField textoConfirmar;
	
	public TelaRecuperarSenha() {
		
		adicionarTituloTela("Recuperação de Senha");
		adicionarImagem();
		labels();
		textFields();
		botoes();
		setVisible(true);
	}
	
	public void adicionarImagem() {
		
		ImageIcon imagem= new ImageIcon("Business/Imagens/iconBasementParts.png", "");
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(140, 140,java.awt.Image.SCALE_SMOOTH);
		imagem= new ImageIcon(newimg);
		
		JLabel logo= new JLabel("");
		logo.setBounds(370, 70, 150, 150);
		logo.setIcon(imagem);
		logo.setVisible(true);
		add(logo);
	}
	
	public void labels() {
		
		JLabel senha= new JLabel("Nova senha: ");
		senha.setFont(new Font("Tohama", Font.PLAIN, 15));
		senha.setBounds(230, 300, 150, 50);
		senha.setVisible(true);
		add(senha);
		
		JLabel confirmar= new JLabel("Confirmar senha: ");
		confirmar.setBounds(230, 400, 180, 50);
		confirmar.setFont(new Font("Tohama", Font.PLAIN, 15));
		confirmar.setVisible(true);
		add(confirmar);
		
		
	}
	
	public void textFields() {
		
		textoSenha= new JTextField();
		textoSenha.setBounds(360, 310, 150, 30);
		textoSenha.setVisible(true);
		add(textoSenha);
		
		textoConfirmar= new JTextField();
		textoConfirmar.setBounds(360, 410, 150, 30);
		textoConfirmar.setVisible(true);
		add(textoConfirmar);
		
	}
	
	public void botoes() {
		
		
		JButton confirmar= new JButton("Confirmar");
		confirmar.setBounds(325, 500, 100, 40);
		confirmar.setVisible(true);
		add(confirmar);
		
		
		confirmar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String senha= textoSenha.getText();
				String confirmar= textoConfirmar.getText();
				
				if(senha.equals(confirmar)) {
					
					
				}
			}
		});
		
		JButton voltar= new JButton("Voltar");
		voltar.setBounds(450, 500, 100, 40);
		voltar.setVisible(true);
		add(voltar);
	}
	
	
	public static void main(String[]args) {
		
		new TelaRecuperarSenha();
	}
	
	
}
