package cenfotec.ac.cr.objetos;

import cenfotec.ac.cr.elementos.Elemento;

public class Amuleto extends Objeto {

	public Amuleto(Elemento elemento) {
		super(elemento);
		setMagia(10);
	}

	/*
	 * Espada aumenta 10 de ataque y defensa. Suma 1 vida. • La armadura aumento 20
	 * de defensa y 20 de vida. • El escudo aumenta 40 de defensa y 10 de vida. • El
	 * amuleto aumenta 10 la magia, excepto en el trabajador.
	 */
	@Override
	public int getVida() {
		// return this.alimento.getNombre() + ", hervida";

		return this.elemento.getVida();
	}

	@Override
	public void setVida(int vida) {

	}

	@Override
	public int getDefensa() {
		return this.elemento.getAtaque();
	}

	@Override
	public void setDefensa(int defenda) {

	}

	@Override
	public int getAtaque() {

		return this.elemento.getAtaque();
	}

	@Override
	public void setAtaque(int ataque) {

	}

	@Override
	public void setMagia(int magia) {
		this.elemento.setMagia(this.elemento.getMagia() + magia);

	}

	@Override
	public void agregarObjeto(Objeto objeto) {
		this.elemento.agregarObjeto(objeto);

	}

	@Override
	public int getMagia() {
		return this.elemento.getMagia();
	}

}
