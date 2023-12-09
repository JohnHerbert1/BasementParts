package dao;

import java.util.ArrayList;

import dto.BoletoDTO;

public class BoletosDAO implements CrudBoleto {
	
	ArrayList<BoletoDTO> allBoletos;

	public BoletosDAO() {
		allBoletos = new ArrayList<>();
	}

	@Override
	public boolean saveBoleto(BoletoDTO boleto) {
		if(read(boleto) != null) {
			return false;
		}
		return true;
	}

	@Override
	public BoletoDTO read(BoletoDTO boleto) {
		for(BoletoDTO b: allBoletos) {
			if(b.getId() ==  boleto.getId()) {
				return b;
			}
		}
		return null;
	}

}
