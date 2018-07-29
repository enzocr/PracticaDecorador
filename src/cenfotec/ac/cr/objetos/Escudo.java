package cenfotec.ac.cr.objetos;

import cenfotec.ac.cr.elementos.Elemento;

public class Escudo extends Objeto {

	public Escudo(Elemento elemento) {
		super(elemento);
		setDefensa(40);
		setVida(10);
	}

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAtaque(int ataque) {
		// TODO Auto-generated method stub

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
