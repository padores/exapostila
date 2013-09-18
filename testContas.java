import static org.junit.Assert.*;

import org.junit.Test;

public class testContas {

	Contas C1 = new Contas();

	@Test
	public void testCalculaQuadrado1() {
		assertEquals(0, C1.calculaQuadrado(0));
	}

	@Test
	public void testCalculaQuadrado2() {
		assertEquals(4, C1.calculaQuadrado(2));
	}

	@Test
	public void testCalculaQuadrado3() {
		assertEquals(4, C1.calculaQuadrado(-2));
	}

	@Test
	public void testCalculaQuadrado4() {
		assertEquals(10000, C1.calculaQuadrado(100));
	}

	@Test
	public void testCalculaQuadrado5() {
		assertEquals(10000, C1.calculaQuadrado(-100));
	}

	@Test
	public void testCalculaCubo1() {
		assertEquals(0, C1.calculaCubo(0));
	}

	@Test
	public void testCalculaCubo2() {
		assertEquals(8, C1.calculaCubo(2));
	}

	@Test
	public void testCalculaCubo3() {
		assertEquals(-8, C1.calculaCubo(-2));
	}

	@Test
	public void testCalculaCubo4() {
		assertEquals(1000000, C1.calculaCubo(100));
	}

	@Test
	public void testCalculaCubo5() {
		assertEquals(-1000000, C1.calculaCubo(-100));
	}
}
