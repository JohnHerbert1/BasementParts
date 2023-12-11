package control;

import java.util.Scanner;

import dto.ProdutoDTO;
import model.ProdutoModel;

public class ProdutoControl {
	
	Scanner scan = new Scanner(System.in);
	private  ProdutoModel productModel;
	
	public ProdutoControl() {
		this.productModel = new ProdutoModel();
	}
	
	public void save(ProdutoDTO dto) {
		/*
		 * ProdutoDTO produto = new ProdutoDTO();
		 * System.out.println("Nome do Produto:");
		 * produto.setNomeDoProduto(scan.nextLine());
		 * System.out.println("price do Produto:");
		 * produto.setPrice(Float.parseFloat(scan.nextLine()));
		 * //System.out.println("ID do Produto:");
		 * //produto.setId(Integer.parseInt(scan.nextLine()));
		 * System.out.println("Montadora do Produto:");
		 * produto.setMontadora(scan.nextLine());
		 */
		productModel.serviceSave(dto);
		
	}
	
	public void displayerAllProducte() {
		System.out.println(productModel.serviceViewAll());
	}
	
	public void remove(ProdutoDTO dto) {
		productModel.remove(dto.getId());
	}
	
	
	

}
