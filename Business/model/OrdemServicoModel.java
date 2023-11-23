package model;

import java.util.ArrayList;

import dao.OrdemServicoDAO;
import dto.OrdemServiceDTO;

public class OrdemServicoModel {
	
	private OrdemServicoDAO ordemServicoDao;
	
	public OrdemServicoModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void serviceConnectCreat(OrdemServiceDTO ordemServico) {
		try {
			ordemServicoDao.save(ordemServico);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<OrdemServiceDTO> serviceConnectDisplayList() {
		return ordemServicoDao.getList();
	}
	
}
