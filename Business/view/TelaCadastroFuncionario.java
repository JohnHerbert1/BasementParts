package view;

import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import Enums.FuncionariosCargos;
import control.FuncionarioControl;
import dao.FuncionarioDAO;
import fabricas.Button;
import fabricas.CriarImagem;
import fabricas.Fabrica;
import fabricas.RadioButton;
import fabricas.Texto;
import fabricas.iLabel;


public class TelaCadastroFuncionario extends TelaPadrao{

	private JTextField textEmail;
	private JTextField textNumero;
	private JTextField textSalario;
	private JRadioButton cargoA;
	private JRadioButton cargoB;
	private FuncionarioDAO funcionarioDAO;
	private FuncionarioControl funcionarioControll;
	
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
		
		iLabel label= iLabel.getLabel();
		JLabel labelEmail= label.produzir("Email: ",100, 200, 100, 60);
		add(labelEmail);
		
		iLabel labelN= iLabel.getLabel();
		JLabel labelNumero = labelN.produzir("Numero: ",100, 280, 100, 60 );
		add(labelNumero);
		
		iLabel labelS= iLabel.getLabel();
		JLabel labelSalario = labelS.produzir("Salário: ", 100, 360, 100, 60);
		add(labelSalario);
		
		iLabel  labelC= iLabel.getLabel();
		JLabel labelCargo= labelC.produzir("Cargo: ", 420, 280 , 100, 60);
		
		add(labelCargo);
	}
	
	public void texts() {
	
		Texto texto= Texto.getTexto();
		textEmail= texto.produzir("", 200, 215, 400, 30);
		add(textEmail);
		
		Texto textoN= Texto.getTexto();
		textNumero= textoN.produzir("", 200, 295, 200, 30);
		add(textNumero);
		
		Texto textoS=Texto.getTexto();
		textSalario= textoS.produzir("", 200, 375, 200, 30);
		add(textSalario);
	}
	
	public void opcaoCargos() {
		
		RadioButton cargo= RadioButton.getRadioButton();
		cargoA= cargo.produzir(String.valueOf(FuncionariosCargos.ATENDENTE) ,480, 278, 200, 30);
		add(cargoA);
		
		RadioButton a= RadioButton.getRadioButton();
		cargoB= a.produzir(String.valueOf(FuncionariosCargos.MECANICO),480, 310, 200, 30);
		add(cargoB);
		
	}
	
	public void botoes() {
		
		Button botao= Button.getButton();
		JButton cadastrar= botao.produzir("Cadastrar", 300, 450, 100, 60);
		
		// criar um funcionarioControll que recebe um funcionarioDAO, pois falta terminar a classe FuncionarioControl
		cadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String email= textEmail.getText();
				String numero= textNumero.getText();
				String salario= textSalario.getText();
				
				if(!email.equals("") && !numero.equals("") && !salario.equals("")) {
					
					if(cargoA.isSelected() && cargoB.isSelected()) {
						
						JOptionPane.showMessageDialog(null, "Os dois Cargos não podem ser escolhidos", "", JOptionPane.INFORMATION_MESSAGE);
					}else {
						
						if (cargoA.isSelected()) {
							
							// salvar as informações no banco de dados
							JOptionPane.showMessageDialog(null, "Salvo!", "", JOptionPane.INFORMATION_MESSAGE);
							dispose();
							
						}else {
							
							// salvar as informações no banco de dados
							JOptionPane.showMessageDialog(null, "Salvo!", "", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						}
						
					}
					
				}
			}
		});
		
		add(cadastrar);
		
		Button botaoF= Button.getButton();
		JButton fechar= botaoF.produzir("Voltar", 450, 450, 100, 60);
		
		fechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				// olhar qual janela dar um new
			}
		});
		
		
		add(fechar);
	}

	public void criarImagen() {
		
		CriarImagem i= CriarImagem.getCriarImagem();
		ImageIcon imagem= i.produzir("Business/Imagens/iconBasementParts.png", 150, 150,0,0); 
		
		
		iLabel label= iLabel.getLabel();
		JLabel logo= label.produzir("", 380, 58, 150, 150);
		logo.setIcon(imagem);
		add(logo);
		
	}
	

	public static void main(String[]args) {
		
		new TelaCadastroFuncionario();
	}
	
}
