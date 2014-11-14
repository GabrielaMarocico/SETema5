package marocico.se.tema5.factoryproducer;

import marocico.se.tema5.abstractfactory.AbstractFactory;
import marocico.se.tema5.factories.ElectrocasniceFactory;
import marocico.se.tema5.factories.ElectroniceFactory;

/**
 * 
 * Clasa ce produce un anumit tip de Factory (ElectroniceFactory sau
 * ElectrocasniceFactory)
 * 
 * @author gby
 *
 */
public class FactoryProducer {

	/**
	 * 
	 * Functie ce creeaza si returneaza un tip de Factory (ElectroniceFactory
	 * sau ElectrocasniceFactory) in functie de parametru
	 * 
	 * @param factory
	 *            tipul factory-ului ce se doreste a fi creat
	 * @return un nou factory de tipul parametrului
	 */
	public static AbstractFactory getFactory(String factory) {

		if (factory == null)
			return null;

		if (factory.equalsIgnoreCase("Electronice"))
			return new ElectroniceFactory();
		else if (factory.equalsIgnoreCase("Electrocasnice"))
			return new ElectrocasniceFactory();

		return null;
	}
}
