package example.app.models;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import example.Types.Climas;
import example.Types.Estacao;

public class AgenciaTest {
	HashMap<Cliente, Boolean> cliente = new HashMap<Cliente, Boolean>();
	HashMap<Destino, Double> destino = new HashMap<Destino, Double>();
	
	protected Agencia agencia
		= new Agencia("Agencia 1", 50, cliente);	

    Climas clima1 = Climas.CHUVOSO;
    Double preco1 = new Double(1.0);
    Destino destino1 = new Destino("Cidade1", 100000, clima1, preco1);
    
    Climas clima2 = Climas.ENSOLARADO;
    Double preco2 = new Double(1.0);
    Destino destino2 = new Destino("Cidade2", 200000, clima2, preco2);
    
    Climas clima3 = Climas.AGRADAVEL;
    Double preco3 = new Double(1.0);
    Destino destino3 = new Destino("Cidade3", 300000, clima3, preco3);
    
    Climas clima4 = Climas.VENTANIA;
    Double preco4 = new Double(1.0);
    Destino destino4 = new Destino("Cidade4", 400000, clima4, preco4);
    Cliente cl1 = new Cliente("José Lucas", 21, "joselucas@teste.com",  "12213231223");
    boolean t = true;
    //cliente.put(cl1, t);
	
	@Test
	public void adicionaDestinoTest1()throws Throwable {
		Climas clima1 = Climas.CHUVOSO;
	    Double preco1 = new Double(1.0);
	    Destino destino1 = new Destino("Cidade1", 100000, clima1, preco1);
	    destino1.setPreco(preco1);
		agencia.setEstacao(Estacao.INVERNO);
		agencia.adicionaDestino(destino1);
		assertTrue(agencia.destinos.get(destino1) == 1);
	}
	
	@Test
	public void adicionaDestinoTest2()throws Throwable {
		agencia.setEstacao(Estacao.OUTONO);
		agencia.adicionaDestino(destino2);
		assertTrue(agencia.destinos.get(destino2) == 0.95);
	}
	
	@Test
	public void adicionaDestinoTest3()throws Throwable {
		agencia.setEstacao(Estacao.VERAO);
		agencia.adicionaDestino(destino3);
		assertTrue(agencia.destinos.get(destino3) == 1.15);
	}
	
	@Test
	public void adicionaDestinoTest4()throws Throwable {
		agencia.setEstacao(Estacao.PRIMAVERA);
		agencia.adicionaDestino(destino4);
		assertTrue(agencia.destinos.get(destino4) == 1.15);
	}
	
	
}
