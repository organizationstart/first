package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {
	Carteira carteira1 = new Carteira(21000, 50000, 21000);
	Carteira carteira2 = new Carteira(1000, 3000, 1000);
	Cliente cliente1 = new Cliente("Carlos", 30, "carlos@email.com", "00 0000-0000");
	Cliente cliente2 = new Cliente("Ana Clara", 19, "ana@email.com", "00 0000-0000", carteira2);
	Cliente cliente3 = new Cliente("Joana", 36, "joana@email.com", "00 0000-0000");
	Cliente cliente4 = new Cliente("Mario", 40, "mario@email.com", "00 0000-0000");
	

	
	@Test
	public void clienteTeste() {
		cliente1.setCarteira(carteira1);
		cliente3.setCarteira(carteira1);
		cliente4.setCarteira(carteira2);
		cliente4.setEmail("maario@email.com");
		assertEquals(cliente1.carteira.saldoTotal(), 92000, .1);
		assertTrue(cliente1.getNome() == "Carlos");
		assertTrue(cliente1.getEmail()== "carlos@email.com");
		assertTrue(cliente1.getFone()== "00 0000-0000");
		cliente1.setFone("11 1111-1111");
		assertTrue(cliente1.getFone()== "11 1111-1111");
		assertTrue(cliente1.getCarteira().saldoTotal() == carteira1.saldoTotal());
	}
	
	@Test
	public void carteiraTeste() {
		assertEquals(carteira1.getLimiteCredito(), 50000, .1);
		assertEquals(carteira1.getLimiteDebito(), 21000, .1);
		assertEquals(carteira1.getSaldo(), 21000, 0.1);
	}
	
	@Test
	public void agencia() {
//		agencia()
	}
	

}
