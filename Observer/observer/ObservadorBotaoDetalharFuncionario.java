package observer;

import view.TelaDetalharFuncionario;
import view.TelaListagemFuncionarios;

public class ObservadorBotaoDetalharFuncionario implements Observador {

    private TelaListagemFuncionarios telaListagemFuncionarios;

	@Override
    public void atualizar() {
		telaListagemFuncionarios.dispose();
		new TelaDetalharFuncionario();
    }
   
}
