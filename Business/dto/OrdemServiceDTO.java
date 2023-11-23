package dto;

import java.time.LocalDate;

import Enums.Prioridade;
import Enums.SituacaoServico;
import Enums.TipoDeOS;

public class OrdemServiceDTO {
	
	private String clientNome;
	private String VendedorName;
	private String MecanicoName; // COMO MECANICO POSSUI CARGO NAO SEI SE VAI SER UMA CLASSE SEPARADA
	private int idOS;//Nao e necessario esta na tela
	private float price;
	private LocalDate dataServico = LocalDate.now();//tambem nao e necessario
	private ProdutoDTO produto;
	private int foneNumber;
	private TipoDeOS tipoOS; //AQUI EU ACONSELHO UM ENUM, MAS PRECISO DE MAIS EXPLICAÇAO DO QUE E ISSO
	private SituacaoServico situacao; //TAMBEM ACONSELHO O USO DO ENUM
	private Prioridade prioridade; // ENUM
	
	public OrdemServiceDTO() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "O.S Dados: " + dataServico + "| " + price + " | ";  
	}

	public String getClientName() {
		return clientNome;
	}

	public void setClientName(String clientName) {
		this.clientNome = clientName;
	}

	public String getVendedorName() {
		return VendedorName;
	}

	public void setVendedorName(String vendedorName) {
		VendedorName = vendedorName;
	}

	public String getMecanicoName() {
		return MecanicoName;
	}

	public void setMecanicoName(String mecanicoName) {
		MecanicoName = mecanicoName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getDataServico() {
		return dataServico;
	}

	public void setDataServico(LocalDate dataServico) {
		this.dataServico = dataServico;
	}

	public int getFoneNumber() {
		return foneNumber;
	}

	public void setFoneNumber(int foneNumber) {
		this.foneNumber = foneNumber;
	}

	public int getIdOS() {
		return idOS;
	}

	public void setIdOS(int idOS) {
		this.idOS = idOS;
	}
	
	
	
}
