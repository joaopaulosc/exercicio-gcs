package br.gov.unit7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.gov.uni7.Calculadora;

public class CalcTest {
	
	@Test
	public void testSoma() {
	    Calculadora calculator = new Calculadora();
	    long sum = calculator.soma(10L, 16L);
	    assertEquals(26, sum);
	}

}
