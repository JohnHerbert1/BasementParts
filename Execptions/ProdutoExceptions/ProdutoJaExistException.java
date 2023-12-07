package ProdutoExceptions;

public class ProdutoJaExistException extends Exception{

	public ProdutoJaExistException() {
		super("ja existe o produto a qual quer cadastrar!!");
	}

}
