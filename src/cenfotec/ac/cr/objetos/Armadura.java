package cenfotec.ac.cr.objetos;

import cenfotec.ac.cr.elementos.Elemento;

public class Armadura extends Objeto {

	public Armadura(Elemento elemento) {
		super(elemento);
		setDefensa(20);
		setVida(20);
	}

	/*
	 * Espada aumenta 10 de ataque y defensa. Suma 1 vida. • La armadura aumento 20
	 * de defensa y 20 de vida. • El escudo aumenta 40 de defensa y 10 de vida. • El
	 * amuleto aumenta 10 la magia, excepto en el trabajador.
	 */
	@Override
	public int getVida() {
		return this.elemento.getVida();
	}

	@Override
	public void setVida(int vida) {
		this.elemento.setVida(this.elemento.getVida() + vida);

	}

	@Override
	public int getDefensa() {
		return this.elemento.getDefensa();
	}

	@Override
	public void setDefensa(int defenda) {
		this.elemento.setDefensa(this.elemento.getDefensa() + defenda);

	}

	@Override
	public int getAtaque() {
		return this.elemento.getAtaque();
	}

	@Override
	public void setAtaque(int ataque) {

	}

	@Override
	public int getMagia() {
		return this.elemento.getMagia();
	}

	@Override
	public void setMagia(int magia) {

	}

	@Override
	public void agregarObjeto(Objeto objeto) {
		this.elemento.agregarObjeto(objeto);
	}

}
