package marocico.se.tema5.electronice;

import marocico.se.tema5.interfaces.IElectronice;

/**
 * 
 * Clasa Smartphone implementeaza interfata IElectronice
 * @author gby
 *
 */
public class Smartphone implements IElectronice {

	/**
	 * Mmebrii clasei Smartphone 
	 * numeProducator 	- numele producatorului
	 * diagonalaInch 	- diagonala (in Inch)
	 */
	String numeProducator;
	double diagonalaInch;

	/**
	 * Constructorul clasei Smartphone ce primeste 2 argumente
	 * 
	 * @param numeProd
	 *            numele producatorului
	 * @param diagonalaInch2
	 *            diagonala (in Inch) a Smartphone-ului
	 */
	public Smartphone(String numeProd, double diagonalaInch2) {
		this.numeProducator = numeProd;
		this.diagonalaInch = diagonalaInch2;
	}

	/**
	 * Functia returneaza un obiect de tipul String si anume numele
	 * producatorului
	 * 
	 * @return numeProducator numele producatorului Smartphone-ului
	 */
	public String getNumeProducator() {
		return numeProducator;
	}

	/**
	 * Functia seteaza numele producatorului cu valoarea data ca argument
	 * 
	 * @param numeProducator
	 *            numele producatorului Smartphone-ului
	 */
	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	/**
	 * Functia returneaza un obiect de tipul Double si anume diagonala (in Inch)
	 * 
	 * @return diagonalaInch 	diagonala (in Inch) a Smartphone-ului
	 */
	public Double getDiagonalaInch() {
		return diagonalaInch;
	}

	/**
	 * Functia seteaza diagonala (in Inch) cu valoarea data ca argument
	 * 
	 * @param diagonalaInch
	 *            diagonala (in Inch) a Smartphone-ului
	 */
	public void setDiagonalaInch(float diagonalaInch) {
		this.diagonalaInch = diagonalaInch;
	}

	/**
	 * Functia afiseaza informatii referitoare la obiectul care o apeleaza
	 */
	@Override
	public void display() {
		System.out.println("Smartphone-ul de la producatorul "
				+ this.numeProducator + " are diagonala de "
				+ this.diagonalaInch + " inch.");
	}

}
