package ProdutoExecptions;

public class ProdutoNaoAtualizadoExecptipn extends Exception {

	public ProdutoNaoAtualizadoExecptipn() {
		super("O produto nao pode ser atualizado |{Valor do objeto null}| ");
	}

}
