import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComissaoTeste {
	
	@Test
	public void testeUmaVenda10000_00PagaComissaoDe500_00() {
		//Arrange
		Comissao comissao = new Comissao();
		double valorVenda = 10000.00;
		double valorComissaoEsperado = 500.00;
		
		//Act
		double valorComissaoCalculado = comissao.calcularComissao(valorVenda);
		
		//Asseert
		assertEquals(valorComissaoEsperado, valorComissaoCalculado);
	}
	
	@Test
	public void testeUmaVendaDe10001_00PagaComissaoDe800_08() {
		Comissao comissao = new Comissao();
		double valorVenda = 10001.00;
		double valorComissaoEsperado = 800.08;
		
		double valorComissaoCalculado = comissao.calcularComissao(valorVenda);
		
		assertEquals(valorComissaoEsperado, valorComissaoCalculado);
	}
	
	@Test
	public void testeUmaVendaDe5349_75PagaComissaoDe267_48() {
		Comissao comissao = new Comissao();
		double valorVenda = 5349.75;
		double valorComissaoEsperado = 267.48;
		
		double valorComissaoCalculado = comissao.calcularComissao(valorVenda);
		
		assertEquals(valorComissaoEsperado, valorComissaoCalculado);
	}
}
