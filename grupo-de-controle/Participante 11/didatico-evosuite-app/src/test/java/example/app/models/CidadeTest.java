package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

import example.Types.Climas;

public class CidadeTest {

	@Test
	public void testCriarCidade() {
		Cidade cidade = new Cidade("Sobral", 1000, Climas.ENSOLARADO);
		assertEquals(cidade.getNome(), "Sobral");
		assertTrue(cidade.getPopulacao() == 1000);
		assertTrue(cidade.getClima() == Climas.ENSOLARADO);
	}
	
	@Test
	public void testSetsCidade() {
		Cidade cidade = new Cidade("Sobral", 1000, Climas.ENSOLARADO);
		cidade.setClima(Climas.VENTANIA);
		cidade.setNome("Fortaleza");
		cidade.setPopulacao(2000);
		assertEquals(cidade.getNome(), "Fortaleza");
		assertTrue(cidade.getPopulacao() == 2000);
		assertTrue(cidade.getClima() == Climas.VENTANIA);
	}


}
