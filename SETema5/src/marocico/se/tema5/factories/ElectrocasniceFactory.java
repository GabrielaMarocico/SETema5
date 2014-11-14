package marocico.se.tema5.factories;

import marocico.se.tema5.abstractfactory.AbstractFactory;
import marocico.se.tema5.electrocasnice.Aragaz;
import marocico.se.tema5.electrocasnice.CuptorCuMicrounde;
import marocico.se.tema5.electrocasnice.PlitaElectrica;
import marocico.se.tema5.electrocasnice.PrajitorPaine;
import marocico.se.tema5.interfaces.IElectrocasnice;
import marocico.se.tema5.interfaces.IElectronice;

/**
 * 
 * Clasa ElectrocasniceFactory mosteneste clasa AbstractFactory
 * @author gby
 *
 */
public class ElectrocasniceFactory extends AbstractFactory {

	/**
	 * Returneaza un obiect de tipul IElectrocasnice. In functie de valoarea
	 * parametrului putereMaxima se va crea si se va returna un obiect de un
	 * anumit tip (Aragaz/CuptorCuMicrounde/PlitaElectrica/PrajitorPaine).
	 * 
	 * @param numeProducator
	 *            numele producatorului
	 * @param diagonalaInch
	 *            diagonala (in Inch)
	 */
	@Override
	public IElectrocasnice getElectrocasnice(String numeProducator,
			int putereMaxima) {

		if (putereMaxima == 0)
			return null;

		if (putereMaxima >= 10 && putereMaxima <= 15)
			return new Aragaz(numeProducator, putereMaxima);
		else if (putereMaxima >= 400 && putereMaxima <= 700)
			return new PrajitorPaine(numeProducator, putereMaxima);
		else if (putereMaxima >= 800 && putereMaxima <= 1000)
			return new CuptorCuMicrounde(numeProducator, putereMaxima);
		else if (putereMaxima >= 1200 && putereMaxima <= 1600)
			return new PlitaElectrica(numeProducator, putereMaxima);

		return null;
	}
	
	@Override
	public IElectronice getElectronice(String numeProducator,
			double diagonalaInch) {
		return null;
	}

}
