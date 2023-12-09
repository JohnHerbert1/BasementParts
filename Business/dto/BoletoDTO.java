package dto;

import java.time.LocalDate;

//ESTA CLASS E PRA SER GERADA A POIS O EFETUAMENTE DA COMPRA PELO CLIENT
public class BoletoDTO {

	private String eMail;
	private FuncionarioDTO funcionario;//FUNCIONARIO QUE FEZ O PEDIDO DA COMPRA OU DO SERVICO 
	private float price;
	private int id;
	private ProdutoDTO produto;
	private LocalDate efetuamentoDaCompra;
	private LocalDate dataDePamento;
	private OrdemServiceDTO servico;
	
	public BoletoDTO() {
	}
	
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public FuncionarioDTO getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioDTO funcionario) {
		this.funcionario = funcionario;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ProdutoDTO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}

	public LocalDate getDataDePamento() {
		return dataDePamento;
	}

	public void setDataDePamento(LocalDate dataDePamento) {
		this.dataDePamento = dataDePamento;
	}

	public OrdemServiceDTO getServico() {
		return servico;
	}

	public void setServico(OrdemServiceDTO servico) {
		this.servico = servico;
	}

	public LocalDate getEfetuamentoDaCompra() {
		return efetuamentoDaCompra;
	}

	public void setEfetuamentoDaCompra(LocalDate efetuamentoDaCompra) {
		this.efetuamentoDaCompra = efetuamentoDaCompra;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
