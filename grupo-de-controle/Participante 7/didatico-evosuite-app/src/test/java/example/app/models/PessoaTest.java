package example.app.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PessoaTest {
	
	Pessoa pessoa = new Pessoa(null, 0);
	@Test
	public void testPessoaNull() {
		assertTrue(pessoa,null);
	}

}
