package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testCriarPessoa() {
		Pessoa pessoa = new Pessoa("Bruna", 18);
		assertEquals(pessoa.getNome(), "Bruna");
		assertEquals(pessoa.getIdade(), 18);
	}
	
	@Test
	public void testSetsPessoa() {
		Pessoa pessoa = new Pessoa("Bruna", 18);
		pessoa.setIdade(20);
		pessoa.setNome("Lucas");
		assertEquals(pessoa.getNome(), "Lucas");
		assertEquals(pessoa.getIdade(), 20);
	}

}
