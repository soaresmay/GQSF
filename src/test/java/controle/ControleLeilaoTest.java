package controle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import leilao.Cliente;
import leilao.Lance;
import leilao.Leilao;
import leilao.Produto;

public class ControleLeilaoTest {
	
	@Test
	public void deveRetornarVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao (produto, lanceMinimo);
		ControleLeilao controle = new 	ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		Lance novoLance = new Lance(cliente, 1201);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada,  validadeRetornada);
	}
	@Test
public void deveRetornarFalsoParaUmLanceMenorQueOValorMinimoDoProduto() {
	Produto produto = new Produto("TV");
	double lanceMinimo = 1200;
	Leilao leilao = new Leilao (produto, lanceMinimo);
	ControleLeilao controle = new 	ControleLeilao();
	Cliente cliente = new Cliente("Zé");
	Lance novoLance = new Lance(cliente, 1000);
	boolean validadeRetornada = controle.validarLance(novoLance, leilao);
	boolean validadeEsperada = false;
	assertEquals(validadeEsperada,  validadeRetornada);
	
}
	@Test
	public void deveRetonarVerdadeiroParaUmLanceIgualAoValorMinimoDoProduto() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao (produto, lanceMinimo);
		ControleLeilao controle = new 	ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		Lance novoLance = new Lance(cliente, 1200);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = true;
		assertEquals(validadeEsperada,  validadeRetornada);
	}
	@Test 
	public void deveRetornarFalsoParaDoisLancesSeguidoDoMesmoCliente() {
		Produto produto = new Produto("TV");
		double lanceMinimo = 1200;
		Leilao leilao = new Leilao (produto, lanceMinimo);
		ControleLeilao controle = new 	ControleLeilao();
		Cliente cliente = new Cliente("Zé");
		leilao.adicionarLance(new Lance(cliente, 1300));
		Lance novoLance = new Lance(cliente, 1400);
		boolean validadeRetornada = controle.validarLance(novoLance, leilao);
		boolean validadeEsperada = false;
		assertEquals(validadeEsperada,  validadeRetornada);	
}
}