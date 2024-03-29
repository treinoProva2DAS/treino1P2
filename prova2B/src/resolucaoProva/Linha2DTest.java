package resolucaoProva;

import static org.junit.Assert.*;

import org.junit.Test;

public class Linha2DTest {

	Linha2D l1,l2;
	Ponto l1a,l2a;
	Ponto l1b,l2b;

	@Test
	public void testRetasSeTocam() {
		l1a = new Ponto(0,0);
		l1b = new Ponto(1,2);
		
		l2a = new Ponto(0,0);
		l2b = new Ponto(3,4);
		
		l1 = new Linha2D(l1a,l1b);
		l2 = new Linha2D(l2a,l2b);
		
		assertTrue(Linha2D.interseccao(l1,l2));
	}
	
	@Test
	public void testRetasNaoSeTocam() {
		l1a = new Ponto(0,0);
		l1b = new Ponto(1,2);
		
		l2a = new Ponto(1,1);
		l2b = new Ponto(3,3);
		
		
		l1 = new Linha2D(l1a,l1b);
		l2 = new Linha2D(l2a,l2b);
		
		assertTrue(Linha2D.interseccao(l1,l2));
	}
	
	
	
	
	@Test
	public void testCalculaCoeficiente(){
		l1a = new Ponto(0,0);
		l1b = new Ponto(1,2);
		
		l2a = new Ponto(0,0);
		l2b = new Ponto(2,4);
		
		l1 = new Linha2D(l1a,l1b);
		l2 = new Linha2D(l1a,l1b);
		
		assertEquals(2, l1.calculacoeficiente(),0.01);
		assertEquals(2, l2.calculacoeficiente(),0.01);
	}
}
