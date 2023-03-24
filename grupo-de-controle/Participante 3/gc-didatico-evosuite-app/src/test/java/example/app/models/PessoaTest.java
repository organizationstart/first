package example.app.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {

	Pessoa pessoa;
	
	@Before
	public void setUp() throws Exception {
		pessoa = new Pessoa("Francisco Pinto", 18);
	}

	@Test
	public void instanciandoAClassePessoa() {
		assertEquals(pessoa.nome, "Francisco Pinto");
		assertEquals(pessoa.idade, 18);
	}
	
	@Test
	public void verificandoGetSetNomePessoa() {
		pessoa.setNome("João do Teste");
		assertEquals(pessoa.getNome(), "João do Teste");
	}
	
	@Test
	public void verificandoGetSetIdadePessoa() {
		pessoa.setIdade(21);
		assertEquals(pessoa.getIdade(), 21);
	}
	
}
