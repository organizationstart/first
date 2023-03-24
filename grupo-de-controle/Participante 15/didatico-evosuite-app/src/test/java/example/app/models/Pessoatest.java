package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pessoatest {

	@Test
	public void testCriacaoPessoa() {
		Pessoa pessoa1 = new Pessoa("Edu", 12);
		assertEquals(pessoa1.nome, "Edu");
		assertEquals(pessoa1.idade, 12);
	}

}
