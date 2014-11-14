package marocico.se.tema5.electrocasnice;

import marocico.se.tema5.interfaces.IElectrocasnice;

/**
 * 
 * Clasa PlitaElectrica implementeaza interfata IElectrocasnice
 * @author gby
 *
 */
public class PlitaElectrica implements IElectrocasnice {
	
	/**
	 * Mmebrii clasei PlitaElectrica 
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
	 *            puterea maxima (in Watt) pe care o poate consuma plita
	 */
	public PlitaElectrica(String numeProd, int putere) {
		this.numeProducator = numeProd;
		this.putereWatt = putere;
	}

	/**
	 * Functia returneaza un obiect de tipul String si anume numele
	 * producatorului
	 * 
	 * @return numeProducator numele producatorului plitei
	 */
	public String getNumeProducator() {
		return numeProducator;
	}

	/**
	 * Functia seteaza numele producatorului cu valoarea data ca argument
	 * 
	 * @param numeProducator
	 *            numele producatorului plitei
	 */
	public void setNumeProducator(String numeProducator) {
		this.numeProducator = numeProducator;
	}

	/**
	 * Functia returneaza un obiect de tipul Int si anume puterea in Watt
	 * 
	 * @return putereWatt puterea maxima (in Watt) pe care o poate consuma
	 *         plita
	 */
	public int getPutereMaxima() {
		return putereWatt;
	}

	/**
	 * Functia seteaza puterea maxima cu valoarea data ca argument
	 * 
	 * @param putere
	 *            puterea maxima (in Watt) pe care o poate consuma plita
	 */
	public void setPutereMaxima(int putere) {
		this.putereWatt = putere;
	}

	/**
	 * Functia afiseaza informatii referitoare la obiectul care o apeleaza
	 */
	@Override
	public void power() {
		System.out.println("Plita electrica de la producatorul "
				+ this.numeProducator + " consuma o putere maxima de "
				+ this.putereWatt + " Watt");
	}

}
