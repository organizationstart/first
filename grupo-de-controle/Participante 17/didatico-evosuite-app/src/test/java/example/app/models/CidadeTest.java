package example.app.models;
import example.Types.Climas;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.Types.Climas;

public class CidadeTest {
	Cidade c;
	Climas cl = Climas.AGRADAVEL;
	@Before
	public void setUp() throws Exception {
		c = new Cidade("a", 1, cl);
	}

	@Test
	public void testgetNome() {
		assertEquals(c.getNome(), "a");
		assertEquals(c.nome, "a");
	}
	
	@Test
	public void testsetNome() {
		c.setNome("bb");
		assertEquals(c.getNome(), "bb");
		assertEquals(c.nome, "bb");
	}
	@Test
	public void testgetPopulacao() {
		assertEquals(c.getPopulacao(), 1, 0);
		assertEquals(c.populacao, 1, 0);
	}
	
	@Test
	public void testsetPopulacao() {
		c.setPopulacao(2);
		assertEquals(c.getPopulacao(), 2, 0);
		assertEquals(c.populacao, 2, 0);
	}
	
	@Test
	public void testgetClima() {
		assertEquals(c.getClima(), cl);
		assertEquals(c.clima, cl);
	}
	
	@Test
	public void testsetClima() {
		c.setClima(Climas.TEMPESTUOSO);
		assertEquals(c.getPopulacao(), Climas.TEMPESTUOSO);
		assertEquals(c.clima, Climas.TEMPESTUOSO);
	}

}
