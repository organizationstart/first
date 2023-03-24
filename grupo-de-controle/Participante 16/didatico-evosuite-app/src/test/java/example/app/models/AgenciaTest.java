package example.app.models;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.Types.Climas;

public class AgenciaTest {
	Agencia agencia;
	Map<Cliente, Boolean> clientes;
	
	@Before
	public void setUp() throws Exception {
		clientes = new HashMap<Cliente, Boolean>();
		agencia = new Agencia("Agencia", 0.00, clientes);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void adicionaDestinoVazioTest() throws Exception {
		Integer populacao = 10000;
		Destino destino = new Destino("Nome Destino", populacao, null, 10.00);

		destino.setClima(Climas.);
		
		agencia.adicionaDestino(destino);		
		
		int tamanhoMapaDestinos = 0;
		Map<Destino, Double> destinos = agencia.getDestinos();
		
        Iterator<Map.Entry<Destino, Double>> iterador = destinos.entrySet().iterator();
        
        while(iterador.hasNext()) {
        	Map.Entry<Destino, Double> cliente = iterador.next();
        	tamanhoMapaDestinos++;
        }

        assertEquals(tamanhoMapaDestinos, 0);
	}
}
