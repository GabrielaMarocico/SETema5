package marocico.se.tema5.electronice;

import marocico.se.tema5.interfaces.IElectronice;

public class Smartphone implements IElectronice {

	String numeProducator;
	float diagonalaInch;

	public String getNumeProducator() {
		return numeProducator;
	}

	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	public float getDiagonalaInch() {
		return diagonalaInch;
	}

	public void setDiagonalaInch(float diagonalaInch) {
		this.diagonalaInch = diagonalaInch;
	}

	public Smartphone(String numeProd, float diagonala) {
		this.numeProducator = numeProd;
		this.diagonalaInch = diagonala;
	}

	@Override
	public void display() {
		System.out.println("Smartphone-ul de la producatorul "
				+ this.numeProducator + " are diagonala de "
				+ this.diagonalaInch + " inch.");
	}

}
