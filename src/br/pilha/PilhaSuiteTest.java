package br.pilha;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// anotacoes para executar todos os metodos de todas as classes informadas abaixo de uma unica vez
@RunWith(Suite.class)
@SuiteClasses(
		{PilhaTestFixture.class, 
			LivroTest.class
		}
)
public class PilhaSuiteTest {

}
