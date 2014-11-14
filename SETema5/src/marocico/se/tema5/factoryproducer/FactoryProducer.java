package marocico.se.tema5.factoryproducer;

import marocico.se.tema5.abstractfactory.AbstractFactory;
import marocico.se.tema5.factories.ElectrocasniceFactory;
import marocico.se.tema5.factories.ElectroniceFactory;

public class FactoryProducer {
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
