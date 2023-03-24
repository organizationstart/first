package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class Clientetest {

	@Test
	public void testCriacaoliente() {
		Cliente cliente1 = new Cliente("Ana", 32, "ana@ana.com", "555-444");
		assertEquals(cliente1.nome, "Ana");
		assertEquals(cliente1.idade, 32);
		assertEquals(cliente1.email, "ana@ana.com");
		assertEquals(cliente1.fone, "555-444");
	}

}
