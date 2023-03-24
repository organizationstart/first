package example.app.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarteiraTest {
	
	@Test
	public void testCriarCarteira() {
		Carteira carteira = new Carteira(100, 500, 50);
		assertEquals(carteira.getSaldo(), 100,01);
		assertEquals(carteira.getLimiteCredito(),500,01);
		assertEquals(carteira.getLimiteDebito(),50,01);
	}
	
	@Test
	public void testSetsCarteira() {
		Carteira carteira = new Carteira(100, 500, 50);
		carteira.setSaldo(150);
		carteira.setLimiteCredito(200);
		carteira.setLimiteDebito(100);
		assertEquals(carteira.getSaldo(), 150,01);
		assertEquals(carteira.getLimiteCredito(),200,01);
		assertEquals(carteira.getLimiteDebito(),100,01);
	}
	
	@Test
	public void testSaldoToral() {
		Carteira carteira = new Carteira(100, 500, 50);
		carteira.setSaldo(150);
		assertEquals(carteira.saldoTotal(), 150,01);
	}
	
	@Test
	public void testCompraSaldoValorMaior() {
		Carteira carteira = new Carteira(300, 1000, 50);
		carteira.compraSaldo(350);
		assertEquals(carteira.saldoTotal(), 650,01);
	}
	
	@Test
	public void testCompraSaldoValorIgual() {
		Carteira carteira = new Carteira(300, 1000, 50);
		carteira.compraSaldo(300);
		assertEquals(carteira.saldoTotal(), 600,01);
	}
	
	@Test
	public void testCompraNoCreditoValorMaior() {
		Carteira carteira = new Carteira(300, 1000, 50);
		carteira.compraNoCredito(1100);
		assertEquals(carteira.saldoTotal(), 1100,01);
	}
	
	@Test
	public void testCompraNoCreditoValorIgual() {
		Carteira carteira = new Carteira(300, 1000, 50);
		carteira.compraNoCredito(1000);
		assertEquals(carteira.saldoTotal(), 1000,01);
	}
	
	@Test
	public void testCompraNoDebitoValorMaior() {
		Carteira carteira = new Carteira(300, 1000, 500);
		carteira.compraNoDebito(1000);
		assertEquals(carteira.saldoTotal(), 500,01);
	}
	
	@Test
	public void testCompraNoDebitoValorIgual() {
		Carteira carteira = new Carteira(300, 1000, 50);
		carteira.compraNoCredito(1000);
		assertEquals(carteira.saldoTotal(), 0,01);
	}
}
