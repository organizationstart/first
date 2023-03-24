package example.app.models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaTest {
	Pessoa p;

	@Before
	public void setUp() throws Exception {
		p = new Pessoa("gabriel", 10);
	}

	@Test
	public void testgetNome() {
		assertEquals(p.getNome(), "gabriel");
		assertEquals(p.nome, "gabriel");
	}
	
	@Test
	public void testsetNome() {
		p.setNome("gabriel2");
		assertEquals(p.getNome(), "gabriel2");
		assertEquals(p.nome, "gabriel2");
	}
	
	@Test
	public void testgetIdade() {
		assertEquals(p.getIdade(), 10);
		assertEquals(p.idade, 10);
	}
	
	@Test
	public void testsetIdade() {
		p.setIdade(20);
		assertEquals(p.getIdade(), 20);
		assertEquals(p.idade, 20);
	}

}
