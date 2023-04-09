package example.app.models;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import example.Types.Climas;

public class Cidade_ESTest extends Destino_ESTest_scaffolding{

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
		Integer integer0 = new Integer(900);
	    Climas climas0 = Climas.VENTANIA;
	    Cidade cidade0 = new Cidade("Sobral", integer0, climas0); 
	    cidade0.setPopulacao(integer0);
	    Integer integer1 = cidade0.getPopulacao();
	    assertEquals((integer0), integer1, 0);
	  }

}