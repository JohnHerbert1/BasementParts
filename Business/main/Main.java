package main;

import view.TelaGerarRelatorio;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * EnvioEmail enviar = new EnvioEmail(); enviar.enviarEmail();
		 */
//		TelaPadrao tela = new TelaPadrao();
		new TelaGerarRelatorio();
//		new TelaListagemProdutos();
		/*
		try {
			GeradorDeRelatorios.gerarPdf();
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		*/
		/*
		 * ProdutoControl model = new ProdutoControl(); model.save();
		 */
	}

}
