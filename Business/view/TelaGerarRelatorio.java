package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaGerarRelatorio extends TelaPadrao {
	
    public TelaGerarRelatorio() {
    	adicionarTituloTela();
    	adicionarBotaoGerarRelatorio();
    	adicionarBotaoCancelar();
    	setVisible(true);
    }

    private void adicionarTituloTela() {
    	JLabel lblTitulo = new JLabel("Gerar Relatório");
    	lblTitulo.setBounds(380, 20, 100, 100);
    	add(lblTitulo);
	}

	private void adicionarBotaoGerarRelatorio() {
        JButton btnGerarRelatorio = new JButton("Gerar Relatório");
        btnGerarRelatorio.setBounds(520, 590, 220, 90);
        add(btnGerarRelatorio);
        
    }

    private void adicionarBotaoCancelar() {
    	JButton btnCancelar = new JButton("Cancelar");
    	btnCancelar.setBounds(150, 590, 220, 90);
    	add(btnCancelar);
    }

}
