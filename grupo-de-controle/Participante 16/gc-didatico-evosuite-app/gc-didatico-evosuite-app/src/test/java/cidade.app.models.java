package example.app.models;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

   @Test
    public void testCidade() {
        Cidade cidade = new Cidade("Ipu", 10000);

        Assert.assertEquals("Ipu", cidade.getNome());
        Assert.assertEquals(10000, cidade.getPopulacao());
        Assert.assertEquals(null, cliente.getClima());
    }
}