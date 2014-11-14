package marocico.se.tema5.abstractfactory;

import marocico.se.tema5.interfaces.IElectrocasnice;
import marocico.se.tema5.interfaces.IElectronice;

/**
 * 
 * Clasa abstracta ce contine 2 metode abstracte si publice ce vor fi
 * implementate in clasele mostenitoare.
 * 
 * @author gby
 *
 */
public abstract class AbstractFactory {

	/**
	 * 
	 * Functie abstracta ce va fi implementata in clasa mostenitoare
	 * 
	 * @param numeProducator
	 *            numele producatorului obiectului
	 * @param d
	 *            diagonala (in Inch) a obiectului
	 */
	public abstract IElectronice getElectronice(String numeProducator,
			double d);

	/**
	 * Functie abstracta ce va fi implementata in clasa mostenitoare
	 * 
	 * @param numeProducator
	 *            numele producatorului obiectului
	 * @param putereaMaxima
	 *            puterea maxima (in Watt) pe care o poate consuma obiectul
	 */
	public abstract IElectrocasnice getElectrocasnice(String numeProducator,
			int putereMaxima);
}