package dto;

import com.itextpdf.awt.geom.misc.HashCode;

import Enums.FuncionariosCargos;

public class FuncionarioDTO {
	
	private String email;
	
	private String numero;
	
	private int idFuncionario = 1;
	
	private double salario;
	
	private FuncionariosCargos cargo;
	
	public FuncionarioDTO() {
	}
	
	@Override
	public int hashCode() {
		return idFuncionario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
}
