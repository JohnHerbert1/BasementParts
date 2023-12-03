package dto;

import java.time.LocalDate;

public class BoletoDTO {

	private String NomeCLient;
	private FuncionarioDTO funcionario;//FUNCIONARIO QUE FEZ O PEDIDO DA COMPRA OU DO SERVICO 
	private float price;
	private ProdutoDTO produto;
	private LocalDate efetuamentoDaCompra;
	private LocalDate dataDePamento;
	private OrdemServiceDTO servico;
	
	public BoletoDTO() {
	}

	public String getNomeCLient() {
		return NomeCLient;
	}

	public void setNomeCLient(String nomeCLient) {
		NomeCLient = nomeCLient;
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
	
	
	
	
	
	
	

}
