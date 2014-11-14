package marocico.se.tema5.electronice;

import marocico.se.tema5.interfaces.IElectronice;

public class Smartphone implements IElectronice {

	@Override
	public void display() {
		System.out.println("Functia display() din clasa Smartphone");
	}

}
