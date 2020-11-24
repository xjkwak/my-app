package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldSumTwoIntegers() {
        int resultado = App.sumar(7, 3);
        assertTrue(resultado == 10);

        resultado = App.sumar(-7, -3);
        assertTrue(resultado == -9);
    }

    @Test
    public void testAssertArrayEquals() {
//        byte[] expected = "trial".getBytes();
//        byte[] actual = "trial".getBytes();

        int expected[] = {2, 3, 5};
        int actual[] = App.primes(3);
        assertArrayEquals("No devuelve los n primeros primos.", expected, actual);
    }

    @Test
    public void testGeneratePrime() {
        int actual = App.generatePrime(1);
        int expected = 2;
        assertEquals(expected, actual);

        actual = App.generatePrime(2);
        expected = 3;
        assertEquals(expected, actual);

        actual = App.generatePrime(3);
        expected = 5;
        assertEquals(expected, actual);

        actual = App.generatePrime(4);
        expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsPrime() {
        boolean actual = App.isPrime(2);
        boolean expected = true;
        assertEquals("El numero deberia ser primo.", expected, actual);

        actual = App.isPrime(11);
        expected = true;
        assertEquals("El numero deberia ser primo.", expected, actual);

        actual = App.isPrime(33);
        expected = false;
        assertEquals("El numero NO deberia ser primo.", expected, actual);
    }
}
