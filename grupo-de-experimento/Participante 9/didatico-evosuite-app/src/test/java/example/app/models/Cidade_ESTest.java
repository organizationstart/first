package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

import example.Types.Climas;

public class Cidade_ESTest {
	
	@Test
	public void construtorTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		assertEquals(cidade.nome, "Isac");
		assertEquals(cidade.clima, Climas.AGRADAVEL);
		assertEquals(cidade.populacao, 1000);
	}
	
	@Test
	public void getNomeTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		assertEquals(cidade.nome, "Isac");
	}
	
	@Test
	public void setNomeTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		cidade.nome = "Casi";
		assertEquals(cidade.nome, "Casi");
	}
	
	@Test
	public void getClimaTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		assertEquals(cidade.clima, Climas.AGRADAVEL);
	}
	
	@Test
	public void setClimaTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		cidade.clima = Climas.ENSOLARADO;
		assertEquals(cidade.clima, Climas.ENSOLARADO);
	}
	
	@Test
	public void getPopulacaoTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		assertEquals(cidade.populacao, 1000);
	}
	
	@Test
	public void setPopulaçaoTest() {
		Cidade cidade = new Cidade("Isac", 1000, Climas.AGRADAVEL);
		cidade.populacao = 2000;
		assertEquals(cidade.populacao, 2000);
	}

}
