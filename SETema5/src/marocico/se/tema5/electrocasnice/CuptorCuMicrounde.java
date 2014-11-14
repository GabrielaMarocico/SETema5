package marocico.se.tema5.electrocasnice;

import marocico.se.tema5.interfaces.IElectrocasnice;

public class CuptorCuMicrounde implements IElectrocasnice {

	String numeProducator;
	int putereWatt;

	public CuptorCuMicrounde(String numeProd, int putere) {
		this.numeProducator = numeProd;
		this.putereWatt = putere;
	}

	public String getNumeProducator() {
		return numeProducator;
	}

	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	public int getPutereMaxima() {
		return putereWatt;
	}

	public void setPutereMaxima(int putere) {
		this.putereWatt = putere;
	}

	@Override
	public void cook() {
		System.out.println("Cuptorul cu Microunde de la producatorul "
				+ this.numeProducator + " consuma o putere maxima de "
				+ this.putereWatt + " Watt");
	}

}
