
import cenfotec.ac.cr.elementos.Elemento;
import cenfotec.ac.cr.elementos.Guerrero;
import cenfotec.ac.cr.objetos.Armadura;
import cenfotec.ac.cr.objetos.Espada;

public class Main {

	public static void main(String[] args) {

		Elemento guerrero = new Guerrero();

		Espada espada = new Espada(guerrero);

		Armadura armadura = new Armadura(guerrero);
		
		

		System.out.println("Hay una espada que brinda a la armadura " + espada.getDefensa() + " de defensa");
		System.out.println("La armadura suma otros " + armadura.getDefensa() + " puntos de defensa");
		System.out.println("Hay un guerrero que tiene " + guerrero.getDefensa() + " de defensa");
		int totaldefensa = espada.getDefensa() + armadura.getDefensa() + guerrero.getDefensa();
		System.out.println("Total de defensa del guerrero: "+totaldefensa);
	}

}
