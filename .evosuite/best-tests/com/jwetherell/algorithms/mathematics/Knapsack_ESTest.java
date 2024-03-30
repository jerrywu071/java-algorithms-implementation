/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 30 22:54:54 GMT 2024
 */

package com.jwetherell.algorithms.mathematics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jwetherell.algorithms.mathematics.Knapsack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Knapsack_ESTest extends Knapsack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Knapsack knapsack0 = new Knapsack();
      int[] intArray0 = new int[6];
      intArray0[0] = 63;
      intArray0[1] = 0;
      intArray0[2] = 906;
      intArray0[3] = 3882;
      intArray0[4] = 0;
      intArray0[5] = (-1);
      // Undeclared exception!
      Knapsack.zeroOneKnapsack(intArray0, intArray0, 2229);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Knapsack knapsack0 = new Knapsack();
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      Knapsack.zeroOneKnapsack(intArray0, intArray0, 0);
      int[] intArray1 = new int[0];
      Knapsack.zeroOneKnapsack(intArray0, intArray1, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 954;
      intArray0[1] = (-1);
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray0, intArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack((int[]) null, (int[]) null, (-2044));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Knapsack knapsack0 = new Knapsack();
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 1326;
      intArray0[2] = 2252;
      intArray0[3] = 0;
      intArray0[4] = (-2069);
      int[] intArray1 = new int[5];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = (-2069);
      intArray1[3] = 0;
      intArray1[4] = 2252;
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray0, intArray1, 615);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2070
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 14;
      intArray0[0] = 14;
      int[] intArray1 = Knapsack.zeroOneKnapsack(intArray0, intArray0, 14);
      int int1 = 162;
      int[] intArray2 = Knapsack.zeroOneKnapsack(intArray0, intArray1, 162);
      int[] intArray3 = Knapsack.zeroOneKnapsack(intArray0, intArray0, 162);
      Knapsack knapsack0 = new Knapsack();
      Knapsack.zeroOneKnapsack(intArray3, intArray2, 14);
      int int2 = (-1921);
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray1, intArray3, (-1921));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1852;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray0, intArray0, 1852);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1853
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Knapsack knapsack0 = new Knapsack();
      int[] intArray0 = new int[2];
      intArray0[0] = 2627;
      intArray0[1] = 1142;
      Knapsack.zeroOneKnapsack(intArray0, intArray0, 1142);
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray0, intArray0, (-1740));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-352);
      intArray0[1] = (-1);
      intArray0[2] = 0;
      intArray0[3] = 297;
      intArray0[4] = 3113;
      intArray0[5] = 0;
      intArray0[7] = (-1);
      intArray0[8] = 360;
      // Undeclared exception!
      try { 
        Knapsack.zeroOneKnapsack(intArray0, intArray0, (-2421));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jwetherell.algorithms.mathematics.Knapsack", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 68;
      intArray0[1] = 2755;
      intArray0[2] = (-1);
      Knapsack.zeroOneKnapsack(intArray0, intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1;
      intArray0[0] = 1;
      int int1 = 2191;
      intArray0[1] = 2191;
      intArray0[2] = 1952;
      int[] intArray1 = Knapsack.zeroOneKnapsack(intArray0, intArray0, 2191);
      Knapsack.zeroOneKnapsack(intArray1, intArray0, 1952);
      Knapsack knapsack0 = new Knapsack();
      int[] intArray2 = new int[1];
      intArray2[0] = 2191;
      Knapsack.zeroOneKnapsack(intArray2, intArray2, 2915);
      int[] intArray3 = new int[5];
      intArray3[0] = 1952;
      intArray3[1] = 913;
      intArray3[2] = 1952;
      intArray3[3] = 1952;
      intArray3[4] = 2191;
      // Undeclared exception!
      Knapsack.zeroOneKnapsack(intArray3, intArray3, 1952);
  }
}