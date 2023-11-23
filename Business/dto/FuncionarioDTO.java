package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import Enums.FuncionariosCargos;

public class FuncionarioDTO {
	
	private String nome;
	
	private int idFuncionario;
	
	private double salario;
	
	private FuncionariosCargos cargo;
	
	public FuncionarioDTO() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public FuncionariosCargos getCargo() {
		return cargo;
	}
	public void setCargo(FuncionariosCargos cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
	
}
