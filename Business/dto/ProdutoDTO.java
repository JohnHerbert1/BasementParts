package dto;

import Enums.SituacaoServico;

//FAZENDO UMA ANALIZE DE COMO FUNCIONA, ACHO QUE NAO A NECESSIDADE DESSA CLASS EXISTIR A NAO SER QUE A CLASS OS PRECISSE DE PECAS E AQUI CONTER INFORMACOES DA PECA A AQUAL O CARRO VAI PRECISSAR A SER ENCOMENDADA

//BASE DE DADOS A QUAL O PRODUTO IRA TER:
public class ProdutoDTO {//NAO SEI SE O POJO SE REFERENCIARA ASSIM MAS, POR EQUANTO VOU CHAMALO DE PRODUTO
	
	//ESTOU VENDO AINDA ALGUMAS QUESTOES, EXEMPLO CONCERTEZA TERA UMA REMESSA DO PRODUTO, POSIVEL PRASO DE ENTREGA E CLARO DEPENDENDO COMO VAMOS FAZER TER UM CARRINHO DE COMPRAS MAS ISTO SERA PARA OS CLIENTS A QUAL ESTÃO CADASTRADOS NO SERVIDO CASO O PRODUTO SEJA COMPRADO PELO SISTEMA SEM QUE AJA O USO DO CLIENT TERA QUE PAGAR NA HORA. 
	private String nomeDoProduto;
	private float price;
	private int id = 1;
	private String montadora;
	private String grupo;
	private String nomeClient;
	private SituacaoServico isPago;

	public ProdutoDTO () {
	}

	public String toString() {
		return "Produto: " + nomeDoProduto + " Preco: " + price + "Montadora: " + montadora;
	}

	@Override
	public int hashCode() {
		return id;
	}
	
	public boolean equals(ProdutoDTO produto) {
		if(produto.id == id) {
			return true;
		}
		
		return false;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getMontadora() {
		return montadora;
	}


	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNomeClient() {
		return nomeClient;
	}

	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}

	public SituacaoServico getIsPago() {
		return isPago;
	}

	public void setIsPago(SituacaoServico isPago) {
		this.isPago = isPago;
	}

	

	
	
}
