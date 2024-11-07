package app;
import model.Campeao;
import service.Combate;

public class Main {
	public static void main (String[] args) {
		
		Campeao campeao1 = new Campeao("Mordekaiser", 100, 2, 10);
		Campeao campeao2 = new Campeao("Vladmir", 100, 3, 10);
		
		Combate combate = new Combate(campeao1, campeao2, 4);
		
		combate.iniciarCombate();
	}
}
