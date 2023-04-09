package example.app.models;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class Agencia_ESTest {

		//test incompleto
	@Test
	public void adicionaDestinoTest() {
		HashMap<Cliente, Boolean> hashMap0 = new HashMap<Cliente, Boolean>();
	    Agencia agencia0 = new Agencia("rock", 100, hashMap0);
	    agencia0.adicionaDestino(null);
	}

}
