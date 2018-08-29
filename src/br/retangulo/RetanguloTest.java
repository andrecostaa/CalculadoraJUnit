package br.retangulo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloTest {
	
	private int base, altura, area;
	
	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][]{
			{10,20,200},
			{10,30,300},
			{10,40,400},
			{10,50,500}
		});
	}
	
	public RetanguloTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}
	
	@Test
	public void testCalcularArea() {
		Retangulo retangulo = new Retangulo(base, altura);
		int resultado = retangulo.calcularArea();

		assertEquals(area, resultado);
	}

	@Ignore
	public void testCalcularPerimetro() {
		fail("Not yet implemented");
	}

}
