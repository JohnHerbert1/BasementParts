package dao;

import dto.BoletoDTO;

public interface CrudBoleto {
	
	public boolean saveBoleto(BoletoDTO boleto);
	
	public BoletoDTO read(BoletoDTO boleto);
		
}
