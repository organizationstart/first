package exemple.test;

import static org.junit.Assert.*;

import org.junit.Test;

import example.app.models.Cliente;

public class ClienteTest {
	Cliente c1 = new Cliente("Thiago",22,"thiagomail.mail","40028922");
	@Test
	public void test() {
		assertEquals(c1.getNome(),"Thiago");
	}

}
