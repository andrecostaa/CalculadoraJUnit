package br.pilha;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PilhaTestRunner {

	public static void main(String[] args) {
		
		//trazemos todos os resultados sendo positivos ou negativos
		Result resultado = JUnitCore.runClasses(LivroTest.class);
		
		//varremos se houve alguma falha nos testes
		List<Failure> falha = resultado.getFailures();
		for (Failure failure : falha) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println("Resultado dos testes: " + resultado.wasSuccessful());
		
	}

}
