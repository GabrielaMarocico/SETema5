package marocico.se.tema5.interfaces;

/**
 * 
 * @author gby IElectrocasnice reprezinta interfata pentru toate obiectele de
 *         tipul clasei Electrocasnice
 *
 */
public interface IElectrocasnice {
	/**
	 * Aceasta functie va fi suprascrisa in toate clasele care implementeaza
	 * interfata IElectrocasnice 
	 * Functia nu returneaza nimic, doar afiseaza
	 * puterea in Watt pe care obiectele din clasele care implementeaza
	 * interfata o au setata.
	 */
	void power();
}
