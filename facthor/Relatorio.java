public abstract class Relatorio <T>{
	
	private final String nomeImpresa = "BasementParts";
	
	
	public final String getImpresaNome() {
		return nomeImpresa;
	}

	public abstract void gerarRelatorio(T object);
}
