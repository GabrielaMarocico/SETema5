package marocico.se.tema5.interfaces;

/**
 * 
 * @author gby Aceasta reprezinta interfata pentru toate obiectele de tipul
 *         clasei Electronice
 *
 */

public interface IElectronice {
	/**
	 * Aceasta functie va fi suprascrisa in toate clasele care implementeaza
	 * interfata IElectronice 
	 * Functia nu returneaza nimic, doar afiseaza
	 * diagonala in inch pe care obiectele din clasele care implementeaza
	 * interfata o au setata.
	 */
	void display();
}
