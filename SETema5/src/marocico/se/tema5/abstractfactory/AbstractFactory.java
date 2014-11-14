package marocico.se.tema5.abstractfactory;

import marocico.se.tema5.interfaces.IElectrocasnice;
import marocico.se.tema5.interfaces.IElectronice;

public abstract class AbstractFactory {
	public abstract IElectronice getElectronice(String numeProducator,
			float diagonalaInch);

	public abstract IElectrocasnice getElectrocasnice(String numeProducator,
			int temperaturaMaxima);
}