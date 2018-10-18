/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import bmi.BMI;
import static bmi.BMI.chisoBMI;
import static junit.framework.TestCase.*;
import junit.framework.TestCase;

/**
 *
 * @author Asus
 */
public class TestBMI extends TestCase{
    public void test1(){
      BMI bmi=new BMI(1.73, 40);
      String s=chisoBMI(bmi);
      assertEquals("Thieu can",s);
    }
    public void test2(){
      BMI bmi=new BMI(1.76, 40);
      String s=chisoBMI(bmi);
      assertEquals("Thieu can",s);
    }
    public void test3(){
      BMI bmi=new BMI(1.73,30);
      String s=chisoBMI(bmi);
      assertEquals("Thieu can",s);
    }
    public void test4(){
      BMI bmi=new BMI(1.63, 40);
      String s=chisoBMI(bmi);
      assertEquals("Thieu can",s);
    }
    public void test5(){
      BMI bmi=new BMI(1.83, 40);
      String s=chisoBMI(bmi);
      assertEquals("Thieu can",s);
    }
    
    
}
