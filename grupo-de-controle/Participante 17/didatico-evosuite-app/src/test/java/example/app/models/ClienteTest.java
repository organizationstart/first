package example.app.models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {
	Cliente c;
	Cliente c1;
	Carteira ca;
	Carteira ca1;
	
	@Before
	public void setUp() throws Exception {
		c = new Cliente("gabriel", 10, "a@a.com", "9090");
		ca = new Carteira(10,10,10);
		ca1 = new Carteira(110,110,110);
		c1 = new Cliente("gabriel", 10, "a@a.com", "9090", ca);
	}

	@Test
	public void testgetEmail() {
		assertEquals(c.getEmail(), "a@a.com");
		assertEquals(c.email, "a@a.com");
	}
	
	@Test
	public void testsetEmail() {
		c.setEmail("a@b.com");
		assertEquals(c.getEmail(), "a@b.com");
		assertEquals(c.email, "a@b.com");
	}
	@Test
	public void testgetFone() {
		assertEquals(c.getFone(), "9090");
		assertEquals(c.fone, "9090");
	}
	
	@Test
	public void testsetFone() {
		c.setFone("90901");
		assertEquals(c.getFone(), "90901");
		assertEquals(c.fone, "90901");
	}
	@Test
	public void testgetCarteira() {
		assertEquals(c1.getCarteira(), ca);
	}
	@Test
	public void testsetCarteira() {
		c1.setCarteira(ca1);
		assertEquals(c.getCarteira(), ca1);
	}
}
