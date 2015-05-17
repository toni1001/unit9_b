/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9_b;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Meseguer Giménez
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
       
    /**
     * Test of validaNif method, of class Alumno.
     */
    @Test
    public void testValidaNif1() {
        System.out.println("validaNif");
        String nif = "21513398Z";
        Alumno instance = new Alumno();
        boolean expResult = false;
        boolean result = instance.validaNif(nif);
        assertEquals(expResult, result);
    }
     @Test
    public void testValidaNif2() {
        System.out.println("validaNif");
        String nif = "007";
        Alumno instance = new Alumno();
        boolean expResult = false;
        boolean result = instance.validaNif(nif);
        assertEquals(expResult, result);
    }
     @Test
    public void testValidaNif3() {
        System.out.println("validaNif");
        String nif = "21513398A";
        Alumno instance = new Alumno();
        boolean expResult = true;
        boolean result = instance.validaNif(nif);
        assertEquals(expResult, result);
    }
      

    /**
     * Test of calculaTasaMatricula method, of class Alumno.
     */
    @Test
    public void testCalculaTasaMatricula1a() {
        System.out.println("calculaTasaMatricula");
        int edad = 24;
        boolean familiaNumerosa = false;
        boolean repetidor = true;
        Alumno instance = new Alumno();
        float expResult = 2000.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalculaTasaMatricula1b() {
        System.out.println("calculaTasaMatricula");
        int edad = 24;
        boolean familiaNumerosa = true;
        boolean repetidor = true;
        Alumno instance = new Alumno();
        float expResult = 250.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testCalculaTasaMatricula1c() {
        System.out.println("calculaTasaMatricula");
        int edad = 24;
        boolean familiaNumerosa = false;
        boolean repetidor = false;
        Alumno instance = new Alumno();
        float expResult = 500.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testCalculaTasaMatricula2() {
        System.out.println("calculaTasaMatricula");
        int edad = 30;
        boolean familiaNumerosa = false;
        boolean repetidor = false;
        Alumno instance = new Alumno();
        float expResult = 500.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testCalculaTasaMatricula3() {
        System.out.println("calculaTasaMatricula");
        int edad = 51;
        boolean familiaNumerosa = false;
        boolean repetidor = false;
        Alumno instance = new Alumno();
        float expResult = 400.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
     @Test
    public void testCalculaTasaMatricula4() {
        System.out.println("calculaTasaMatricula");
        int edad = 65;
        boolean familiaNumerosa = false;
        boolean repetidor = false;
        Alumno instance = new Alumno();
        float expResult = 250.0F;
        float result = instance.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertEquals(expResult, result, 0.0);
    }
              
      

    
}
