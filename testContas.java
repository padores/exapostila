import static org.junit.Assert.*;

import org.junit.Test;


public class testContas {

	Contas C1 = new Contas();
	
	@Test
	public void testCalculaQuadrado() {
		assertEquals(0, C1.calculaQuadrado(0));
		assertEquals(1, C1.calculaQuadrado(1));
		assertEquals(1, C1.calculaQuadrado(-1));
		assertEquals(10000, C1.calculaQuadrado(100));
		assertEquals(10000, C1.calculaQuadrado(-100));
	}

}
