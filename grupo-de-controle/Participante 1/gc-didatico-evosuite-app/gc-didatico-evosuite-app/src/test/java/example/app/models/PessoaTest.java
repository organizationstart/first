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
		p = new Pessoa("Evandro", 11);
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void pessoaTest() {
		assertEquals(p.nome, "Evandro");
		assertEquals(p.idade, 11);
	}	
	
	@Test
	public void nomeTest() {
		p.setNome("Evandro");
		assertEquals(p.getNome(), "Evandro");
	}
	
	@Test
	public void idadeTest() {
		p.setIdade(22);
		assertEquals(p.getIdade(), 22);
	}

}
