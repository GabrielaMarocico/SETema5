package marocico.se.tema5.main;

import marocico.se.tema5.abstractfactory.AbstractFactory;
import marocico.se.tema5.factoryproducer.FactoryProducer;
import marocico.se.tema5.interfaces.IElectrocasnice;
import marocico.se.tema5.interfaces.IElectronice;

/**
 * 
 * Clasa principala
 * 
 * @author gby
 *
 */
public class Main {
	
	public static void main(String[] args) {

		/** Creez un Factory de tipul Electrocasnice */
		AbstractFactory electrocasnice = FactoryProducer.getFactory("Electrocasnice");

		/** Creez un obiect de tipul clasei Aragaz */
		IElectrocasnice electrocasnice1 = electrocasnice.getElectrocasnice("Zanussi", 13);

		/** Afisez informatiile obiectului electrocasnice1 */
		electrocasnice1.power();

		/** Creez un obiect de tipul clasei PrajitorPaine */
		IElectrocasnice electrocasnice2 = electrocasnice.getElectrocasnice("Bosch", 550);

		/** Afisez informatiile obiectului electrocasnice2 */
		electrocasnice2.power();

		/**  Creez un obiect de tipul clasei CuptorCuMicrounde */
		IElectrocasnice electrocasnice3 = electrocasnice.getElectrocasnice("Samsung", 900);

		/** Afisez informatiile obiectului electrocasnice3 */
		electrocasnice3.power();

		/**  Creez un obiect de tipul clasei PlitaElectrica */
		IElectrocasnice electrocasnice4 = electrocasnice.getElectrocasnice("Bosch", 1400);

		/** Afisez informatiile obiectului electrocasnice4 */
		electrocasnice4.power();

		/** Creez un Factory de tipul Electronice */
		AbstractFactory electronice = FactoryProducer.getFactory("Electronice");

		/** Creez un obiect de tipul clasei Smartphone */
		IElectronice electronice1 = electronice.getElectronice("Samsung",4.8);

		/** Afisez informatiile obiectului electronice1 */
		electronice1.display();

		/** Creez un obiect de tipul clasei Laptop */
		IElectronice electronice2 = electronice.getElectronice("Sony", 17);

		/** Afisez informatiile obiectului electronice2 */
		electronice2.display();

		/** Creez un obiect de tipul clasei Smartphone */
		IElectronice electronice3 = electronice.getElectronice("Allview", 10);

		/** Afisez informatiile obiectului electronice3 */
		electronice3.display();

	}
}
