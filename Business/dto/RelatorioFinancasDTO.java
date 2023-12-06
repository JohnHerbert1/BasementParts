package dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class RelatorioFinancasDTO {
	
	private int id = 1;
	private final LocalDate mesServico = LocalDate.now();
	private ArrayList<OrdemServiceDTO> todosServicos;
	private ArrayList<ProdutoDTO> todosOsProdutos;
	private float valor;
	
	
	public RelatorioFinancasDTO() {
	}

	@Override
	public int hashCode() {
		return id;
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


	public ArrayList<OrdemServiceDTO> getTodosServicos() {
		return todosServicos;
	}


	public void setTodosServicos(ArrayList<OrdemServiceDTO> todosServicos) {
		this.todosServicos = todosServicos;
	}


	public ArrayList<ProdutoDTO> getTodosOsProdutos() {
		return todosOsProdutos;
	}


	public void setTodosOsProdutos(ArrayList<ProdutoDTO> todosOsProdutos) {
		this.todosOsProdutos = todosOsProdutos;
	}
	
	

}
