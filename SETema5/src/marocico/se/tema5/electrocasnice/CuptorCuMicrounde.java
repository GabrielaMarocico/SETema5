package marocico.se.tema5.electrocasnice;

import marocico.se.tema5.interfaces.IElectrocasnice;

/**
 * 
 * Clasa CuptorCuMicrounde implementeaza interfata IElectrocasnice 
 * @author gby
 *
 */
public class CuptorCuMicrounde implements IElectrocasnice {

	/**
	 * Mmebrii clasei CuptorCuMicrounde 
	 * numeProducator 	- numele producatorului
	 * putere 			- puterea maxima (in Watt)
	 */
	String numeProducator;
	int putereWatt;

	/**
	 * Constructorul clasei CuptorCuMicrounde ce primeste 2 argumente
	 * 
	 * @param numeProd
	 *            numele producatorului
	 * @param putere
	 *            puterea maxima (in Watt) pe care o poate consuma cuptorul
	 */
	public CuptorCuMicrounde(String numeProd, int putere) {
		this.numeProducator = numeProd;
		this.putereWatt = putere;
	}

	/**
	 * Functia returneaza un obiect de tipul String si anume numele
	 * producatorului
	 * 
	 * @return numeProducator numele producatorului cuptorului
	 */
	public String getNumeProducator() {
		return numeProducator;
	}

	/**
	 * Functia seteaza numele producatorului cu valoarea data ca argument
	 * 
	 * @param numeProducator
	 *            numele producatorului cuptorului
	 */
	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	/**
	 * Functia returneaza un obiect de tipul Int si anume puterea in Watt
	 * 
	 * @return putereWatt puterea maxima (in Watt) pe care o poate consuma
	 *         cuptorul
	 */
	public int getPutereMaxima() {
		return putereWatt;
	}

	/**
	 * Functia seteaza puterea maxima cu valoarea data ca argument
	 * 
	 * @param putere
	 *            puterea maxima (in Watt) pe care o poate consuma cuptorul
	 */
	public void setPutereMaxima(int putere) {
		this.putereWatt = putere;
	}

	/**
	 * Functia afiseaza informatii referitoare la obiectul care o apeleaza
	 */
	@Override
	public void power() {
		System.out.println("Cuptorul cu Microunde de la producatorul "
				+ this.numeProducator + " consuma o putere maxima de "
				+ this.putereWatt + " Watt");
	}

}
