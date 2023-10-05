package dto;

//BASE DE DADOS A QUAL O PRODUTO IRA TER:
public class ProdutoDTO {//NAO SEI SE O POJO SE REFERENCIARA ASSIM MAS, POR EQUANTO VOU CHAMALO DE PRODUTO
	
	private String nomeDoProduto;
	private float price;
	private int id;
	private String Montadora;
	private String grupo;
	private String Fornecedor;
	private ClientDTO client;//IREMOS VER COMO FAZ UMA CHAVE ESTRANGEIRA.
	

	public ProdutoDTO () {
	}
	

}
