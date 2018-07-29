package cenfotec.ac.cr.decorador;

import cenfotec.ac.cr.elementos.Elemento;
import cenfotec.ac.cr.objetos.Objeto;

public abstract class DecoradorElemento extends Elemento {

	public abstract int getVida();

	public abstract void setVida(int vida);

	public abstract int getDefensa();

	public abstract void setDefensa(int defenda);

	public abstract int getAtaque();

	public abstract void setAtaque(int ataque);

	public abstract int getMagia();
	
	public abstract void setMagia(int magia);

	public abstract void agregarObjeto(Objeto objeto);
}
