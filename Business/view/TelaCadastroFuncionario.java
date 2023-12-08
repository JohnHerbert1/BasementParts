package view;

import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import Enums.FuncionariosCargos;

public class TelaCadastroFuncionario extends TelaPadrao{

	public TelaCadastroFuncionario() {
		
		adicionarTituloTela("Cadastro de Funcionário", 320, 0, 250, 110);
		labels();
		texts();
		opcaoCargos();
		botoes();
		criarImagen();
		setVisible(true);
	}
	
	public void labels() {
		
		JLabel labelEmail= new JLabel("Email: ");
		labelEmail.setBounds(100, 200, 100, 60);
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelEmail.setVisible(true);
		add(labelEmail);
		
		JLabel labelNumero= new JLabel("Numero: ");
		labelNumero.setBounds( 100, 280, 100, 60);
		labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNumero.setVisible(true);
		add(labelNumero);
		
		JLabel labelSalario = new JLabel("Salário: ");
		labelSalario.setBounds(100, 360, 100, 60);
		labelSalario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelSalario.setVisible(true);
		add(labelSalario);
		
		JLabel labelCargo= new JLabel("Cargo: ");
		labelCargo.setBounds(420, 280 , 100, 60);
		labelCargo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelCargo.setVisible(true);
		add(labelCargo);
	}
	
	public void texts() {
		
		JTextField  textEmail= new JTextField();
		textEmail.setBounds(200, 215, 400, 30);
		textEmail.setVisible(true);
		add(textEmail);
		
		JTextField textNumero= new JTextField();
		textNumero.setBounds(200, 295, 200, 30);
		textNumero.setVisible(true);
		add(textNumero);
		
		JTextField textSalario = new JTextField();
		textSalario.setBounds(200, 375, 200, 30);
		textSalario.setVisible(true);
		add(textSalario);
	}
	
	public void opcaoCargos() {
		
		
		JRadioButton cargosA= new JRadioButton(String.valueOf(FuncionariosCargos.ATENDENTE));
		cargosA.setBounds(480, 278, 200, 30);
		cargosA.setVisible(true);
		add(cargosA);
		
		JRadioButton cargoB= new JRadioButton(String.valueOf(FuncionariosCargos.MECANICO));
		cargoB.setBounds(480, 310, 200, 30);
		cargoB.setVisible(true);
		add(cargoB);
		
	}
	
	public void botoes() {
		
		JButton cadastrar= new JButton("Cadastrar");
		cadastrar.setBounds(300, 450, 100, 60);
		cadastrar.setVisible(true);
		add(cadastrar);
		
		JButton fechar= new JButton("Voltar");
		fechar.setBounds(450, 450, 100, 60);
		fechar.setVisible(true);
		add(fechar);
	}

	public void criarImagen() {
		
		ImageIcon imagem= new ImageIcon("Business/Imagens/iconBasementParts.png", "");
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(150, 150,java.awt.Image.SCALE_SMOOTH);
		imagem= new ImageIcon(newimg);
		
		JLabel logo= new JLabel("");
		logo.setBounds(380, 58, 150, 150);
		logo.setIcon(imagem);
		logo.setVisible(true);
		add(logo);
		
	}
	
	public static void main(String[]args) {
		
		new TelaCadastroFuncionario();
	}
	
}
