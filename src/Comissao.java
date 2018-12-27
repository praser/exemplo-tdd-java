
public class Comissao {
	private final double BASE_CALCULO_COMISSAO = 10000;

	public double calcularComissao(double valorVenda) {
		double aliquotaComissao;
		aliquotaComissao = valorVenda <= BASE_CALCULO_COMISSAO ? 0.05 : 0.08;
		
		return Math.floor(valorVenda * aliquotaComissao * 100) / 100;
	}

}
