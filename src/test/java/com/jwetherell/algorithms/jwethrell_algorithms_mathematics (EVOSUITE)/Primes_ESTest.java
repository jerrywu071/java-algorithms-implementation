/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 30 22:47:45 GMT 2024
 */

package com.jwetherell.algorithms.mathematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jwetherell.algorithms.mathematics.Primes;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Primes_ESTest extends Primes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 7;
      Primes.millerRabinTest(7);
      Primes.isPrime(7);
      Primes.isPrime(2L);
      int int1 = 0;
      Primes.millerRabinTest(0);
      int int2 = 9375;
      Primes.millerRabinTest(9375);
      long long0 = 0L;
      Primes.getPrimeFactorization(0L);
      Primes.isPrime(3046L);
      // Undeclared exception!
      Primes.sieveOfEratosthenes(9375);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Primes.millerRabinTest(0);
      Primes primes0 = new Primes();
      Primes.millerRabinTest(317);
      Primes.millerRabinTest(0);
      Primes.millerRabinTest((-2375));
      Primes.getPrimeFactorization(0);
      Primes.sieveOfEratosthenes(1);
      Primes.millerRabinTest(0);
      Primes.getPrimeFactorization((-2053L));
      Primes.getPrimeFactorization(0);
      Primes.millerRabinTest(325);
      Primes.getPrimeFactorization(325);
      Primes.isPrime(0L);
      Primes.isPrime((-1L));
      Primes.isPrime(325);
      Primes.getPrimeFactorization((-2074L));
      Primes.isPrime((-2074L));
      Primes.sieveOfEratosthenes(0);
      Primes.isPrime(317);
      Primes.getPrimeFactorization(1L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = (-2688);
      Primes.millerRabinTest((-2688));
      Primes.isPrime(4L);
      Primes.isPrime(4L);
      Primes.millerRabinTest((-2688));
      Primes.isPrime(4L);
      Primes primes0 = new Primes();
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-2688));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Primes.getPrimeFactorization(0L);
      int int0 = 3;
      Primes.millerRabinTest(3);
      Primes.isPrime((-2977L));
      long long0 = (-1L);
      Primes.getPrimeFactorization((-1L));
      Primes.getPrimeFactorization(1L);
      Primes.sieveOfEratosthenes(3);
      long long1 = (-6092L);
      Primes.isPrime((-6092L));
      int int1 = 750;
      Primes.millerRabinTest(750);
      Primes.millerRabinTest(750);
      Primes.getPrimeFactorization(9L);
      Primes.millerRabinTest(3);
      Primes.isPrime((-2977L));
      Primes primes0 = new Primes();
      Primes.sieveOfEratosthenes(4);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-944));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 1795265022;
      Primes.millerRabinTest(1795265022);
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(273L);
      // Undeclared exception!
      Primes.getPrimeFactorization(1795265022);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Primes.millerRabinTest(1);
      Primes.isPrime(1);
      Primes primes0 = new Primes();
      Primes.millerRabinTest(1);
      Primes.getPrimeFactorization(1);
      Primes.millerRabinTest(1);
      Primes.getPrimeFactorization(2800L);
      Primes.millerRabinTest(1);
      Primes.sieveOfEratosthenes(1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Primes.isPrime((-860L));
      Primes primes0 = new Primes();
      Primes.sieveOfEratosthenes(1);
      Primes.getPrimeFactorization(526L);
      Primes.sieveOfEratosthenes(435);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Primes.getPrimeFactorization(0L);
      int int0 = (-2249);
      Primes.millerRabinTest((-2249));
      Primes primes0 = new Primes();
      Primes.millerRabinTest((-282));
      Primes.getPrimeFactorization(245L);
      Primes.getPrimeFactorization(0L);
      Primes.getPrimeFactorization(0L);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-2249));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Primes.millerRabinTest(7);
      Primes.getPrimeFactorization(58L);
      Primes.isPrime((-2408L));
      Primes.millerRabinTest(7);
      Primes.millerRabinTest(7);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.millerRabinTest((-1));
      Primes.getPrimeFactorization(0L);
      Primes.isPrime((-1L));
      // Undeclared exception!
      Primes.sieveOfEratosthenes(450775);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(1L);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-780));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Primes.sieveOfEratosthenes(3);
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(3);
      Primes.getPrimeFactorization((-706L));
      Primes.getPrimeFactorization(3);
      Primes.sieveOfEratosthenes(3);
      Primes.millerRabinTest(3);
      Primes.millerRabinTest(3);
      Primes.getPrimeFactorization((-3066L));
      Primes.isPrime((-1L));
      Primes.millerRabinTest(3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(0L);
      int int0 = (-5723);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-5723));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Primes.getPrimeFactorization(0L);
      Primes.getPrimeFactorization(0L);
      Primes primes0 = new Primes();
      Primes.sieveOfEratosthenes(246);
      Primes.sieveOfEratosthenes(0);
      Primes.getPrimeFactorization(0L);
      Primes.millerRabinTest(1233);
      Primes.sieveOfEratosthenes(1233);
      long long0 = 2047L;
      Primes.isPrime(2047L);
      Primes.isPrime(1L);
      int int0 = (-254);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-254));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Primes.getPrimeFactorization(657L);
      Primes.millerRabinTest(0);
      Primes.sieveOfEratosthenes(4);
      Primes.sieveOfEratosthenes(289);
      Primes.isPrime((-1L));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Primes.getPrimeFactorization((-3098L));
      Primes.getPrimeFactorization(551L);
      Primes.millerRabinTest(149);
      Primes.getPrimeFactorization(0L);
      Primes.isPrime(551L);
      Primes.isPrime(149);
      Primes.millerRabinTest(149);
      Primes.getPrimeFactorization(0L);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Primes.getPrimeFactorization(4623L);
      Primes.sieveOfEratosthenes(325);
      Primes primes0 = new Primes();
      Primes.sieveOfEratosthenes(0);
      Primes.millerRabinTest(325);
      Primes.sieveOfEratosthenes(325);
      Primes.getPrimeFactorization((-1088L));
      Primes.getPrimeFactorization(4623L);
      Primes.isPrime(325);
      Primes.sieveOfEratosthenes(325);
      Primes.getPrimeFactorization((-337L));
      Primes.getPrimeFactorization(0L);
      Primes.isPrime((-1088L));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Primes.getPrimeFactorization((-935L));
      Primes.isPrime(1L);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Primes.getPrimeFactorization((-747L));
      Primes.isPrime((-747L));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Primes.sieveOfEratosthenes(0);
      Primes.getPrimeFactorization(241L);
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(0L);
      Primes.getPrimeFactorization(0);
      Primes.sieveOfEratosthenes(0);
      Primes.sieveOfEratosthenes(0);
      Primes.getPrimeFactorization(241L);
      Primes.isPrime(9L);
      Primes.getPrimeFactorization(0L);
      Primes.millerRabinTest(0);
      Primes.getPrimeFactorization((-308L));
      Primes.millerRabinTest(9780504);
      Primes.sieveOfEratosthenes(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Primes.millerRabinTest(2412);
      Primes.getPrimeFactorization(2412);
      Primes.getPrimeFactorization(2412);
      Primes.millerRabinTest(0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Primes.millerRabinTest(2777);
      Primes primes0 = new Primes();
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-786));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Primes.millerRabinTest((-1107));
      Primes.millerRabinTest((-1107));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.millerRabinTest(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Primes.millerRabinTest(2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Primes.getPrimeFactorization(0L);
      Primes.isPrime(1263L);
      Primes.isPrime(1263L);
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(0L);
      Primes.isPrime(1467);
      Primes.getPrimeFactorization(1263L);
      Primes.sieveOfEratosthenes(0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = 1631L;
      Primes.isPrime(1631L);
      Primes primes0 = new Primes();
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-2106));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Primes.isPrime(1506L);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(1401L);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Primes.isPrime(0L);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Primes.getPrimeFactorization((-1L));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Primes.getPrimeFactorization(0L);
      Primes.millerRabinTest(3);
      Primes.isPrime((-2977L));
      Primes.getPrimeFactorization(30L);
      Primes.getPrimeFactorization(1L);
      Primes.sieveOfEratosthenes(3);
      Primes.isPrime((-6092L));
      Primes.millerRabinTest(750);
      Primes.millerRabinTest(750);
      Primes.getPrimeFactorization(9L);
      Primes.millerRabinTest(3);
      Primes.isPrime((-2977L));
      Primes primes0 = new Primes();
      Primes.sieveOfEratosthenes(4);
      Primes.millerRabinTest(3);
      Primes.getPrimeFactorization(3);
      Primes.getPrimeFactorization(0L);
      Primes.millerRabinTest(1);
      Primes.getPrimeFactorization(30L);
      Primes.millerRabinTest(750);
      Primes.getPrimeFactorization((-6092L));
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-3574));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Primes primes0 = new Primes();
      Primes.millerRabinTest(1367);
      Primes.getPrimeFactorization((-706L));
      Primes.getPrimeFactorization((-3066L));
      Primes.isPrime((-1L));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Primes.getPrimeFactorization(677);
      Primes.isPrime(677);
      Primes.millerRabinTest(5542);
      Primes.millerRabinTest(2);
      int int0 = (-750);
      // Undeclared exception!
      try { 
        Primes.sieveOfEratosthenes((-750));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Primes", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Primes.sieveOfEratosthenes(4218);
      Primes.millerRabinTest(4218);
      Primes.sieveOfEratosthenes(0);
      Primes.millerRabinTest(9375);
      Primes.isPrime(9375);
      Primes primes0 = new Primes();
      Primes.getPrimeFactorization(9375);
      Primes.millerRabinTest(9375);
      Primes.getPrimeFactorization(0);
      // Undeclared exception!
      Primes.sieveOfEratosthenes(9375);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(1631L);
      assertFalse(boolean0);
      
      Primes primes0 = new Primes();
      Primes.millerRabinTest(1);
      Map<Long, Long> map0 = Primes.getPrimeFactorization(1631L);
      assertEquals(15, map0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Primes.getPrimeFactorization(2L);
      boolean boolean0 = Primes.sieveOfEratosthenes(5);
      Primes.millerRabinTest(5);
      boolean boolean1 = Primes.isPrime(5);
      assertTrue(boolean1 == boolean0);
      
      Primes.getPrimeFactorization(5);
      Primes.getPrimeFactorization(5);
      Primes.millerRabinTest(0);
      Primes.millerRabinTest(5);
      Map<Long, Long> map0 = Primes.getPrimeFactorization(0);
      assertTrue(map0.isEmpty());
      
      boolean boolean2 = Primes.isPrime(194L);
      boolean boolean3 = Primes.millerRabinTest(5);
      assertFalse(boolean3 == boolean2);
      
      Map<Long, Long> map1 = Primes.getPrimeFactorization(5);
      assertEquals(2, map1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(197L);
      Primes.getPrimeFactorization(3L);
      Primes primes0 = new Primes();
      Map<Long, Long> map0 = Primes.getPrimeFactorization((-272L));
      assertEquals(0, map0.size());
      
      Map<Long, Long> map1 = Primes.getPrimeFactorization(3L);
      assertFalse(map1.isEmpty());
      
      boolean boolean1 = Primes.millerRabinTest(325);
      assertFalse(boolean1);
      
      Primes.isPrime(3L);
      boolean boolean2 = Primes.millerRabinTest(4);
      assertFalse(boolean2 == boolean0);
      
      boolean boolean3 = Primes.sieveOfEratosthenes(0);
      boolean boolean4 = Primes.millerRabinTest(0);
      assertFalse(boolean4 == boolean3);
      assertFalse(boolean4);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Primes primes0 = new Primes();
      boolean boolean0 = Primes.millerRabinTest(317);
      Primes.millerRabinTest((-2352));
      boolean boolean1 = Primes.sieveOfEratosthenes(1);
      assertFalse(boolean1);
      
      Map<Long, Long> map0 = Primes.getPrimeFactorization((-2053L));
      boolean boolean2 = Primes.millerRabinTest(325);
      Primes.isPrime((-2352));
      Primes.isPrime(325);
      boolean boolean3 = Primes.isPrime(325);
      boolean boolean4 = Primes.isPrime((-2074L));
      assertFalse(boolean4 == boolean2);
      
      boolean boolean5 = Primes.sieveOfEratosthenes(0);
      assertFalse(boolean5 == boolean3);
      
      boolean boolean6 = Primes.isPrime(317);
      assertTrue(boolean6 == boolean0);
      
      Map<Long, Long> map1 = Primes.getPrimeFactorization(1L);
      assertTrue(map1.equals((Object)map0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Primes.isPrime(1L);
      boolean boolean1 = Primes.isPrime(930L);
      assertFalse(boolean1);
      
      boolean boolean2 = Primes.millerRabinTest((-651));
      assertFalse(boolean2 == boolean0);
      
      boolean boolean3 = Primes.millerRabinTest(1146);
      Map<Long, Long> map0 = Primes.getPrimeFactorization(1146);
      assertEquals(13, map0.size());
      
      boolean boolean4 = Primes.isPrime(0L);
      assertFalse(boolean4 == boolean3);
      assertTrue(boolean4);
  }
}
