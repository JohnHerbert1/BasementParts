package ProdutoExecptions;

public class ProdutoNaoExisteException extends Exception {

	public ProdutoNaoExisteException() {
		super("Nao a produto cadastrado!!");
	}

}
