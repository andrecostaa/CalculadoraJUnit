package br.calculadora;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// anotacao que ordena ascendente por nome os metodos
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//isso nao e considerado uma boa pratica , pois , a ordenacao tem que ser independente entre os metodos testados
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
	
	@Test(timeout = 200) // valor em milisegundos
	public void testSomarComTimeOut() {
		int a = 20;
		int b = 10;
		
		int resultado = calculadora.somarComTimeOut(a, b);
		
		assertEquals(30, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividirPorZero() {
		int a = 20;
		int b = 0;
		
		calculadora.dividir(a, b);
	}

	@Test
	public void testSomarNumerosNegativos() {
		int a = -3;
		int b = -10;
		int resultado = calculadora.somar(a, b);
		
		assertEquals(-13, resultado);
	}

	@Test
	public void testDividir() {
		int a = 20;
		int b = 2;
		int resultado = calculadora.dividir(a, b);
		
		assertEquals(10, resultado);
	}
}
