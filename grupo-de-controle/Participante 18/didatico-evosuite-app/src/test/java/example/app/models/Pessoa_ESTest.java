package example.app.models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import example.Types.Climas;

public class Pessoa_ESTest {

	//@Test(timeout = 4000)
	  //public void test00()  throws Throwable  {
		//Integer integer0 = new Integer(22);
	    //Pessoa pessoa0 = new Pessoa("Rebeca", (0));
	    //pessoa0.setIdade((0));
	    //pessoa0.getIdade();
	    //assertEquals((0), integer0, 0);
	  //}
	
	@Test(timeout = 4000)
	  public void test01()  throws Throwable  {
		Integer integer0 = new Integer(22);
	    Pessoa pessoa0 = new Pessoa("Rebeca", (22));
	    assertEquals("Rebeca", pessoa0.getNome());
	    pessoa0.setNome("Rebeca");
	  }

}