package dao;

import java.util.ArrayList;

import dto.ProdutoDTO;

public class ProdutoDAO implements ProdutoCrud <ProdutoDTO>{
	
	private ArrayList<ProdutoDTO> allTheProducte = new ArrayList<>();
	

	@Override
	public ArrayList<ProdutoDTO> getList() {
		return allTheProducte;
	}

	@Override
	public boolean save(ProdutoDTO produtoDto) throws Exception {
		
		if(read(produtoDto.getId()) != null) {//ESPESIFICANDO ESTA LINHA DE FORMA RESUMIDA E QUE SE O METODO READ RETORNA UM PRODUTO QUE DIZER QUE ELE JA EXISTE OU SEJA, O PRODUTO POSSUI ID SEMELHANTE E ESTA APTO A NAO SER SALVO NA ARRAY
			return false;
		}
		
		allTheProducte.add(produtoDto);
		return true;
	}

	@Override
	public ProdutoDTO read(int id) throws Exception {
		for(int i = 0; i < allTheProducte.size();i++) {
			if(allTheProducte.get(i).getId() == id) {
				return allTheProducte.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean update(ProdutoDTO produtoDto) {
		
		if(produtoDto != null) {
			
		}
		
		return false;
	}

	@Override
	public void delect(int id) {//VOU VER SE CRIO UM COD A QUAL ELE VAI SERVI PRA MODIFICAR O ID,DE UMA FORMA QUE VERIFIQUE A ARRAY E SEU ID SEJA DEACORDO COM A POSIÇÃO.
		
		try {
			allTheProducte.remove(read(id));//ESTE REMOVE, NAO A NECESSIDADE DE UM INDICE REMOVE VERIFICANDO OBJETO NA ARRAY
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
