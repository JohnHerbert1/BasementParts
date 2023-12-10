package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaListagemProdutos;

public class ObservadorDetalharProduto implements ActionListener {

    private TelaListagemProdutos telaListagemProdutos;

    public ObservadorDetalharProduto(TelaListagemProdutos telaListagemProdutos) {
    	this.telaListagemProdutos = telaListagemProdutos;
    }

    @Override
    public void actionPerformed(ActionEvent clique) {
    	JOptionPane.showMessageDialog(telaListagemProdutos, "Clicou!!!");
    }

}
