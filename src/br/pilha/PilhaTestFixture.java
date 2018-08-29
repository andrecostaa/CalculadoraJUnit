package br.pilha;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PilhaTestFixture {

	private static Pilha pilha;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("executou o @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("executou o @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("A Roda");
		Livro livro3 = new Livro("O Globo");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		System.out.println("Executou o @Before");
	}

	@After
	public void tearDown() throws Exception {
		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		System.out.println("Executou o @After");
	}

	@Test
	public void testNaoAdicionaAlemLimite() {
		pilha.push(new Livro("A volta ao mundo"));
		Livro livro = pilha.pop();
		
		assertEquals("O Sol", livro.getTitulo());
		System.out.println("Executou o testNaoAdicionaAlemLimite()");
	}

	@Test
	public void testNaoAdicionaLivroForaPadraoNome() {
		pilha.pop();
		pilha.push(new Livro("Fora do padrao"));
		Livro livro = pilha.pop();
		
		assertEquals("A Lua", livro.getTitulo());
		System.out.println("Executou o testNaoAdicionaLivroForaPadraoNome()");
	}
}
