package main;

import view.TelaGerarRelatorio;
import view.TelaListagemServicos;
import view.TelaPadrao;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * EnvioEmail enviar = new EnvioEmail(); enviar.enviarEmail();
		 */
		TelaPadrao tela = new TelaPadrao();
		new TelaListagemServicos();
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
