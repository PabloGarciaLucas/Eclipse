package com.venancio.daw.Entornos;

import static org.junit.Assert.assertEquals;

class calculatormayteTest {

	@org.junit.Test
	void testSuma() {
		//fail("Not yet implemented");
		int valorEsperado = 30;
		calculatormayte calcu = new calculatormayte(20,10);
		int resultado = calcu.suma();
		assertEquals ( valorEsperado, resultado, 0);
	}

	@org.junit.Test
	void testResta() {
		//fail("Not yet implemented");
		int valorEsperado = 10;
		calculatormayte calcu = new calculatormayte(20,10);
		int resultado = calcu.resta();
		assertEquals ( valorEsperado, resultado, 0);
	}

	@org.junit.Test
	void testMultiplicacion() {
		//fail("Not yet implemented");
		int valorEsperado = 200;
		calculatormayte calcu = new calculatormayte(20,10);
		int resultado = calcu.multiplicacion();
		assertEquals ( valorEsperado, resultado, 0);
	}

	@org.junit.Test
	void testDivision() {
		//fail("Not yet implemented");
		int valorEsperado = 2;
		calculatormayte calcu = new calculatormayte(20,10);
		int resultado = calcu.division();
		assertEquals ( valorEsperado, resultado, 0);
	}

}
