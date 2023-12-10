package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaListagemProdutos;

public class ObservavelBotaoGerarRelatorioProduto implements ActionListener {

	private TelaListagemProdutos telaListagemProdutos;
	
	public ObservavelBotaoGerarRelatorioProduto(TelaListagemProdutos telaListagemProdutos) {
		this.telaListagemProdutos = telaListagemProdutos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
