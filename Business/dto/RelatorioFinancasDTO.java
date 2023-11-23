package dto;

import java.time.LocalDate;

public class RelatorioFinancasDTO {
	
	private int id;
	private final LocalDate mesServico = LocalDate.now();
	private float valor;
	
	
	public RelatorioFinancasDTO() {
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getMesServico() {
		return mesServico;
	}

}
