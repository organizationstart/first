package example.app.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarteiraTest {
	Carteira c;
	@Before
	public void setUp() throws Exception {
		c = new Carteira(10, 10, 10);
		
	}

	@Test
	public void testgetSaldo() {
		assertEquals(c.getSaldo(), 10, 0);
	}
	
	@Test
	public void testsetSaldo() {
		c.setSaldo(20);
		assertEquals(c.getSaldo(), 20, 0);
	}
	
	@Test
	public void testgetLimiteCredito() {
		assertEquals(c.getLimiteCredito(), 10, 0);
	}
	@Test
	public void testgetLimiteDebito() {
		assertEquals(c.getLimiteDebito(), 10, 0);
	}
	
	@Test
	public void testsetLimiteDebito() {
		c.setLimiteDebito(20);
		assertEquals(c.getLimiteDebito(), 20, 0);
	}
	
	@Test
	public void testsetLimiteCredito() {
		c.setLimiteCredito(20);
		assertEquals(c.getLimiteCredito(), 20, 0);
	}
	@Test
	public void adicionaSaldo() {
		c.adicionaSaldo(20);
		assertEquals(c.getSaldo(), 30, 0);
	}
	@Test
	public void testsaldoTotal() {
		assertEquals(c.saldoTotal(), 30, 0);
	}
	@Test
	public void testcompraSaldo() {
		c.compraSaldo(10);
		assertEquals(c.getSaldo(), 20, 0);
		c.compraSaldo(50);
		assertEquals(c.getSaldo(), 20, 0);
	}
	@Test
	public void testcompraNoCredito() {
		c.compraNoCredito(10);
		assertEquals(c.getLimiteCredito(), 0, 0);
		c.compraNoCredito(50);
		assertEquals(c.getLimiteCredito(), 0, 0);
	}
	@Test
	public void testcompraNoDebito() {
		c.compraNoDebito(10);
		assertEquals(c.getLimiteDebito(), 0, 0);
		c.compraNoDebito(50);
		assertEquals(c.getLimiteDebito(), 0, 0);
	}
	
	@Test
	public void testcombinaSaldo() {
		c.combinaSaldo();
		assertEquals(c.getSaldo(), 30, 0);
		c.compraNoDebito(50);
		assertEquals(c.getLimiteDebito(), 0, 0);
	}


}
