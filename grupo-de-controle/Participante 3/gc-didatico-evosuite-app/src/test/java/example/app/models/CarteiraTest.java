package example.app.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarteiraTest {
	Carteira wallet;
	
	@Before
	public void setUp() throws Exception {
		wallet = new Carteira(5000, 10000, 10000);
	}
	
	
	@Test
	public void verificaIncrementoDoSaldo() {
		wallet.adicionaSaldo(1500);
		assertTrue(wallet.getSaldo() == 6500);
	}
	
	@Test
	public void verificaSaldoTotal() {
		assertTrue(wallet.saldoTotal() == 25000);
	}
	

}
