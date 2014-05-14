package resolucaoProva;

public class Linha2D {

	private Ponto l1a;
	private Ponto l2a;

	public Linha2D(Ponto l1a, Ponto l2a) {
		this.l1a = l1a;
		this.l2a = l2a;
		
	}

	public static boolean interseccao(Linha2D l1, Linha2D l2) {
		return true;
	}

	public double calculacoeficiente() {
		double resultado = ((l2a.getY() - l1a.getY()) /(l2a.getX() - l1a.getX()) );
		return resultado;
	}

}
