import geral.OptionNotExistExcption;
import organazi.ValueStatic;

public class FacthorDocument {

	
	public static Relatorio creatReport(String tipy)throws OptionNotExistExcption {
		
		Relatorio document = null;
		switch(tipy.toLowerCase()) {
		case ValueStatic.RELATORIO_FINANCAS:
				document = new RelatorioFinancas();
				break;
		case ValueStatic.RELATORIO_CLIENT:
				document = new RelatorioClient();
			break;
		default:
			throw new OptionNotExistExcption();
		}
		
		return document;
	}

}
