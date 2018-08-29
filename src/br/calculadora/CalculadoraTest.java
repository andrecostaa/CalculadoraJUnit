package br.calculadora;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora;

	@Before
	public void instanciarClasseCalculadora() {
		if (calculadora == null) {
			calculadora = new Calculadora();
			System.out.println("Instanciando a classe Calculadora...");
		}
	}
	
	@Test
	public void testSomar() {
		int a = 20;
		int b = 10;
		
		int resultado = calculadora.somar(a, b);
		
		assertEquals(30, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividirPorZero() {
		int a = 20;
		int b = 0;
		
		calculadora.dividir(a, b);
	}
}
