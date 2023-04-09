package example.app.models;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import example.Types.Climas;

public class AgenciaTest {

	@Test
	public void test00() {
		
		Cliente cliente1 = new Cliente("João", 24, "joao@email.com", "40028922");
		Destino destino1 = new Destino("Sobral", 212000, Climas.ENSOLARADO, 32.55);
		Map<Cliente, Boolean> listaAgencias = new HashMap<Cliente, Boolean>();		
		listaAgencias.put(cliente1, true);
		Agencia agencia1 = new Agencia("CVC", 1000.0, listaAgencias);
		
	}
	

	
}
