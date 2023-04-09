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
    public void testConstructorWithoutCarteira() {
        Cliente cliente = new Cliente("Lucas M", 22, "example@example.com", "64564564564456");

        Assert.assertEquals("Lucas M", cliente.getNome());
        Assert.assertEquals(22, cliente.getIdade());
        Assert.assertEquals("example@example.com", cliente.getEmail());
        Assert.assertEquals("64564564564456", cliente.getFone());
        Assert.assertEquals(null, cliente.getCarteira());
    }
}