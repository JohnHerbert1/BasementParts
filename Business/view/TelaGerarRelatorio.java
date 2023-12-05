package view;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.itextpdf.text.Font;

public class TelaGerarRelatorio extends TelaPadrao {
	
	// Construtor que irá gerar os componentes da tela.
    public TelaGerarRelatorio() {
    	adicionarTituloTela();
    	adicionarBotaoGerarRelatorio();
    	adicionarBotaoCancelar();
    	setVisible(true);
    }

    // Adicionar título da tela.
    private void adicionarTituloTela() {
    	JLabel lblTitulo = new JLabel("Gerar Relatório");
    	lblTitulo.setBounds(400, 20, 100, 100);
    	add(lblTitulo);
	}

    // Adicionar botão de gerar relatório.
	private void adicionarBotaoGerarRelatorio() {
        JButton btnGerarRelatorio = new JButton("Gerar Relatório");
        btnGerarRelatorio.setBounds(520, 590, 220, 90);
        add(btnGerarRelatorio);
        
    }

	// Adicionar botão de cancelar.
    private void adicionarBotaoCancelar() {
    	JButton btnCancelar = new JButton("Cancelar");
    	btnCancelar.setBounds(150, 590, 220, 90);
    	add(btnCancelar);
    }

}
