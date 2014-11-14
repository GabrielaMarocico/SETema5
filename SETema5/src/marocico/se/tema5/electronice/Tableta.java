package marocico.se.tema5.electronice;

import marocico.se.tema5.interfaces.IElectronice;

/**
 * 
 * Clasa Tableta implementeaza interfata IElectronice
 * @author gby
 *
 */
public class Tableta implements IElectronice {

	/**
	 * Mmebrii clasei Tableta
	 * numeProducator 	- numele producatorului
	 * diagonalaInch 	- diagonala (in Inch)
	 */
	String numeProducator;
	Double diagonalaInch;

	/**
	 * Constructorul clasei Laptop ce primeste 2 argumente
	 * 
	 * @param numeProd
	 *            numele producatorului
	 * @param diagonala
	 *            diagonala (in Inch) a Tabletei
	 */
	public Tableta(String numeProd, double diagonala) {
		this.numeProducator = numeProd;
		this.diagonalaInch = diagonala;
	}

	/**
	 * Functia returneaza un obiect de tipul String si anume numele
	 * producatorului
	 * 
	 * @return numeProducator numele producatorului Tabletei
	 */
	public String getNumeProducator() {
		return numeProducator;
	}

	/**
	 * Functia seteaza numele producatorului cu valoarea data ca argument
	 * 
	 * @param numeProducator
	 *            numele producatorului Tabletei
	 */
	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	/**
	 * Functia returneaza un obiect de tipul Double si anume diagonala (in Inch)
	 * 
	 * @return diagonalaInch 	diagonala (in Inch) a Tabletei
	 */
	public double getDiagonalaInch() {
		return diagonalaInch;
	}

	/**
	 * Functia seteaza diagonala (in Inch) cu valoarea data ca argument
	 * 
	 * @param diagonalaInch
	 *            diagonala (in Inch) a Tabletei
	 */
	public void setDiagonalaInch(double diagonalaInch) {
		this.diagonalaInch = diagonalaInch;
	}

	/**
	 * Functia afiseaza informatii referitoare la obiectul care o apeleaza
	 */
	@Override
	public void display() {
		System.out.println("Tableta de la producatorul " + this.numeProducator
				+ " are diagonala de " + this.diagonalaInch + " inch.");
	}

}
