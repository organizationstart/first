package example.app.models;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setNome("Maria");
        assertEquals("Maria", pessoa.getNome());
    }

    @Test
    public void testGetIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        assertEquals(30, pessoa.getIdade());
    }

    @Test
    public void testSetIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setIdade(35);
        assertEquals(35, pessoa.getIdade());
    }

    
}