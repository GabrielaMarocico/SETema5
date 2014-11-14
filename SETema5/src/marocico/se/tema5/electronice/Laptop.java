package marocico.se.tema5.electronice;

import marocico.se.tema5.interfaces.IElectronice;

public class Laptop implements IElectronice {

	@Override
	public void display() {
		System.out.println("Functia display() din clasa Laptop");
	}

}
