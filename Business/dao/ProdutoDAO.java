package dao;

import java.util.ArrayList;

import ProdutoExceptions.ProdutoJaExistException;
import ProdutoExceptions.ProdutoNaoAtualizadoExecptipn;
import ProdutoExceptions.ProdutoNaoExisteException;
import bd.Persistencia;
import bd.ProdutoTabela;
import dto.ProdutoDTO;

public class ProdutoDAO implements CrudProduto <ProdutoDTO>{
	
	
	private ArrayList<ProdutoDTO> allTheProducte = new ArrayList<>();
	

	@Override
	public ArrayList<ProdutoDTO> getList() {
		return allTheProducte;
	}

	@Override
	public boolean save(ProdutoDTO produtoDto) throws Exception {
		
		//ESPESIFICANDO ESTA LINHA DE FORMA RESUMIDA E QUE SE O METODO READ RETORNA UM PRODUTO QUE DIZER QUE ELE JA EXISTE OU SEJA, O PRODUTO POSSUI ID SEMELHANTE E ESTA APTO A NAO SER SALVO NA ARRAY
		if(read(produtoDto.getId()) != null) {
			throw new ProdutoJaExistException();
		}
		
		allTheProducte.add(produtoDto);
		return true;
	}

	@Override
	
	//AQUI ESTOU LENDO OS DADOS APARTI DO ID, PARA SER USADO ENTRE OS METODOS
	public ProdutoDTO read(int id) throws Exception {//VALOR QUE E RETORNADO E O PRODUTO A QUAL QUERO BERIFICAR
		for(int i = 0; i < allTheProducte.size();i++) {
			if(allTheProducte.get(i).getId() == id) {
				return allTheProducte.get(i);
			}
		}
		return null;
	}



	@Override
	public void delect(int id) {//VOU VER SE CRIO UM COD A QUAL ELE VAI SERVI PRA MODIFICAR O ID,DE UMA FORMA QUE VERIFIQUE A ARRAY E SEU ID SEJA DEACORDO COM A POSIÇÃO.
		
		try {
			allTheProducte.remove(read(id));//ESTE REMOVE, NAO A NECESSIDADE DE UM INDICE REMOVE VERIFICANDO OBJETO NA ARRAY
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	//ESTOU MODIFICANDO APENAS DADOS INPORTANTES, REFERENTES AO PRODUTO
	public boolean update(int id, int preco, String nome) throws Exception {
		ProdutoDTO produto = read(id);
		if(produto != null) {
			produto.setNomeDoProduto(nome);
			produto.setPrice(preco);
			return true;
		}
		throw new ProdutoNaoAtualizadoExecptipn();
		}
		
	}



