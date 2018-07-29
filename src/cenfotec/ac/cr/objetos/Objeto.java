package cenfotec.ac.cr.objetos;

import cenfotec.ac.cr.decorador.DecoradorElemento;
import cenfotec.ac.cr.elementos.Elemento;

public abstract class Objeto extends DecoradorElemento {
	public Elemento elemento;

	public Objeto(Elemento elemento) {
		this.elemento = elemento;
	}

	@Override
	public abstract int getVida();

	@Override
	public abstract void setVida(int vida);

	@Override
	public abstract int getDefensa();

	@Override
	public abstract void setDefensa(int defenda);

	@Override
	public abstract int getAtaque();

	@Override
	public abstract void setAtaque(int ataque);

	
	
	@Override
	public abstract void setMagia(int magia);

	@Override
	public abstract void agregarObjeto(Objeto objeto);

}
