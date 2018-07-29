package cenfotec.ac.cr.objetos;

import cenfotec.ac.cr.elementos.Elemento;

public class Espada extends Objeto {

	public Espada(Elemento elemento) {
		super(elemento);
		setAtaque(10);
		setDefensa(10);
	}

	@Override
	public int getVida() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVida(int vida) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getDefensa() {
		return this.elemento.getAtaque();
	}

	@Override
	public void setDefensa(int defenda) {
		this.elemento.setDefensa(this.elemento.getDefensa() + defensa);

	}

	@Override
	public int getAtaque() {
		return this.elemento.getAtaque();
	}

	@Override
	public void setAtaque(int ataque) {
		this.elemento.setAtaque(this.elemento.getAtaque() + ataque);

	}

	@Override
	public int getMagia() {
		return this.elemento.getMagia();
	}

	@Override
	public void setMagia(int magia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarObjeto(Objeto objeto) {
		// TODO Auto-generated method stub

	}

}
