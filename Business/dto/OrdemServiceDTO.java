package dto;

import java.time.LocalDate;

public class OrdemServiceDTO {
	
	private String clientName;
	private String VendedorName;
	private String MecanicoName; // COMO MECANICO POSSUI CARGO NAO SEI SE VAI SER UMA CLASSE SEPARADA
	private float price;
	private LocalDate dataServico;
	private int foneNumber;
	//private tipoDeOs; //AQUI EU ACONSELHO UM ENUM, MAS PRECISO DE MAIS EXPLICAÇAO DO QUE E ISSO
	//private situacao; //TAMBEM ACONSELHO O USO DO ENUM
	//private prioridade; // ENUM
	
	public OrdemServiceDTO() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "O.S Dados: " + dataServico + "| " + price + " | ";  
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
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
	
	
	
}
