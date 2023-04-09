/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 26 22:19:26 GMT 2022
 */

package example.Util;

import org.junit.Test;
import static org.junit.Assert.*;
import example.Util.ConversorMoedas;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConversorMoedas_ESTest extends ConversorMoedas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(903.951229695867, 824.6388, 903.951229695867, (-436.4));
      assertEquals(903.951229695867, conversorMoedas0.libra, 0.01);
      
      conversorMoedas0.setLibra(0.0);
      assertEquals(0.0, conversorMoedas0.libra, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      conversorMoedas0.euro = 1.0;
      conversorMoedas0.setEuro(565.84893691);
      assertEquals(565.84893691, conversorMoedas0.getEuro(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      conversorMoedas0.quantia = 704.117591;
      double double0 = conversorMoedas0.getQuantia();
      assertEquals(704.117591, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(903.951229695867, 824.6388, 903.951229695867, (-436.4));
      double double0 = conversorMoedas0.getQuantia();
      assertEquals(903.951229695867, conversorMoedas0.libra, 0.01);
      assertEquals((-436.4), double0, 0.01);
      assertEquals(824.6388, conversorMoedas0.euro, 0.01);
      assertEquals(903.951229695867, conversorMoedas0.dolar, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas((-3061.1779363241726), 0.0, (-140.53933836424986), 0.0);
      double double0 = conversorMoedas0.getLibra();
      assertEquals(0.0, conversorMoedas0.euro, 0.01);
      assertEquals((-3061.1779363241726), conversorMoedas0.dolar, 0.01);
      assertEquals((-140.53933836424986), double0, 0.01);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas((-3061.1779363241726), 0.0, (-140.53933836424986), 0.0);
      double double0 = conversorMoedas0.getEuro();
      assertEquals((-140.53933836424986), conversorMoedas0.libra, 0.01);
      assertEquals((-3061.1779363241726), conversorMoedas0.dolar, 0.01);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas((-3784.15019551), (-3784.15019551), (-3784.15019551), (-794.5272647913215));
      double double0 = conversorMoedas0.getEuro();
      assertEquals((-3784.15019551), conversorMoedas0.dolar, 0.01);
      assertEquals((-3784.15019551), double0, 0.01);
      assertEquals((-794.5272647913215), conversorMoedas0.quantia, 0.01);
      assertEquals((-3784.15019551), conversorMoedas0.libra, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(1.0, 1.0, 1117.34, 0.0);
      double double0 = conversorMoedas0.getDolar();
      assertEquals(1117.34, conversorMoedas0.libra, 0.01);
      assertEquals(1.0, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas((-258.80868), 0.0, 0.0, (-258.80868));
      double double0 = conversorMoedas0.getDolar();
      assertEquals((-258.80868), double0, 0.01);
      assertEquals((-258.80868), conversorMoedas0.quantia, 0.01);
      assertEquals(0.0, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, conversorMoedas0.libra, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(903.951229695867, 824.6388, 903.951229695867, (-436.4));
      double double0 = conversorMoedas0.converteQuantiaParaLibra((-72.68521382890437));
      assertEquals(903.951229695867, conversorMoedas0.libra, 0.01);
      assertEquals(824.6388, conversorMoedas0.euro, 0.01);
      assertEquals((-394484.31663927634), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(1.0, 1.0, 1117.34, 0.0);
      double double0 = conversorMoedas0.converteQuantiaParaEuro(0.0);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
      assertEquals(1.0, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1117.34, conversorMoedas0.libra, 0.01);
      assertEquals(1.0, conversorMoedas0.dolar, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas((-1492.7), (-444.49333));
      double double0 = conversorMoedas0.converteQuantiaParaEuro(3263.5866957617754);
      assertEquals((-444.49333), conversorMoedas0.quantia, 0.01);
      assertEquals((-4871555.860763602), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(2133.29552, (-1.0));
      conversorMoedas0.setDolar((-1053.4391423085783));
      double double0 = conversorMoedas0.converteQuantiaParaDolar((-1.0));
      assertEquals((-1053.4391423085783), conversorMoedas0.dolar, 0.01);
      assertEquals(1053.4391423085783, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      conversorMoedas0.setDolar((-1757.41069316129));
      conversorMoedas0.quantia = 704.117591;
      double double0 = conversorMoedas0.converteQuantiaParaDolar(0.0);
      assertEquals((-1757.41069316129), conversorMoedas0.dolar, 0.01);
      assertEquals((-1237423.7836663676), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      double double0 = conversorMoedas0.getDolar();
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(565.84893691, conversorMoedas0.euro, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      conversorMoedas0.setQuantia((-1757.41069316129));
      conversorMoedas0.setDolar((-1757.41069316129));
      double double0 = conversorMoedas0.converteQuantiaParaLibra(565.84893691);
      assertEquals((-1757.41069316129), conversorMoedas0.dolar, 0.01);
      assertEquals(3088492.344437646, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      double double0 = conversorMoedas0.converteQuantiaParaEuro(704.117591);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
      assertEquals(398424.19032698014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      double double0 = conversorMoedas0.converteQuantiaParaDolar(0.0);
      assertEquals(565.84893691, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      double double0 = conversorMoedas0.getLibra();
      assertEquals(565.84893691, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, conversorMoedas0.quantia, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      double double0 = conversorMoedas0.getQuantia();
      assertEquals(0.0, double0, 0.01);
      assertEquals(565.84893691, conversorMoedas0.euro, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(565.84893691, 0.0);
      conversorMoedas0.setLibra(565.84893691);
      double double0 = conversorMoedas0.getLibra();
      assertEquals(565.84893691, conversorMoedas0.libra, 0.01);
      assertEquals(565.84893691, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(2284.325677708693, 2284.325677708693);
      double double0 = conversorMoedas0.getEuro();
      assertEquals(2284.325677708693, double0, 0.01);
      assertEquals(2284.325677708693, conversorMoedas0.quantia, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConversorMoedas conversorMoedas0 = new ConversorMoedas(2284.325677708693, 2284.325677708693);
      double double0 = conversorMoedas0.converteQuantiaParaLibra(2284.325677708693);
      assertEquals(2284.325677708693, conversorMoedas0.quantia, 0.01);
      assertEquals(2284.325677708693, conversorMoedas0.euro, 0.01);
      assertEquals(0.0, double0, 0.01);
  }
}