package br.calculadora;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int somarComTimeOut(int a, int b) {
		int x = 10;
		while (x > 0) {
			try {
				Thread.sleep(200);
				x--;
			} catch (InterruptedException e) {
			}
		}
		return a + b;
	}

	public int dividir(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	
}
