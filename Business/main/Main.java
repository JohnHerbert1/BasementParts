package main;

import control.ProdutoControl;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * EnvioEmail enviar = new EnvioEmail(); enviar.enviarEmail();
		 */
//		TelaPadrao tela = new TelaPadrao();
		//new TelaListagemServicos();
		//new TelaListagemProdutos();
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
		/*
		 * 
		 */
		ProdutoControl control = new ProdutoControl(); 
		control.save();
	}

}
