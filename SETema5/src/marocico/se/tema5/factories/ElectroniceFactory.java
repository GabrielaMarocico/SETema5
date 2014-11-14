package marocico.se.tema5.factories;

import marocico.se.tema5.abstractfactory.AbstractFactory;
import marocico.se.tema5.electronice.Laptop;
import marocico.se.tema5.electronice.Smartphone;
import marocico.se.tema5.electronice.Tableta;
import marocico.se.tema5.interfaces.IElectrocasnice;
import marocico.se.tema5.interfaces.IElectronice;

public class ElectroniceFactory extends AbstractFactory {

	@Override
	public IElectronice getElectronice(String numeProducator,
			float diagonalaInch) {

		if (diagonalaInch == 0.0)
			return null;

		if (diagonalaInch > 4 && diagonalaInch < 7)
			return new Smartphone(numeProducator, diagonalaInch);
		else if (diagonalaInch >= 7 && diagonalaInch < 13)
			return new Tableta(numeProducator, diagonalaInch);
		else if (diagonalaInch >= 13 && diagonalaInch < 17)
			return new Laptop(numeProducator, diagonalaInch);

		return null;
	}

	@Override
	public IElectrocasnice getElectrocasnice(String numeProducator,
			int putereMaxima) {
		return null;
	}

}
