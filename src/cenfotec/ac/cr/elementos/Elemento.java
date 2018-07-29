package cenfotec.ac.cr.elementos;

import java.util.ArrayList;

import cenfotec.ac.cr.objetos.Objeto;

public abstract class Elemento {
	public int vida = 0;
	public int defensa = 0;
	public int ataque = 0;
	public int magia = 0;
	public ArrayList<Objeto> objetos = new ArrayList<>();

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defenda) {
		this.defensa = defenda;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public void agregarObjeto(Objeto objeto) {
		objetos.add(objeto);
	}

}
