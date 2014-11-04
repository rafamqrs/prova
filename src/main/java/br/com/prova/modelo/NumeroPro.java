package br.com.prova.modelo;

import br.com.prova.interfaces.CalculoInterface;

public class NumeroPro implements CalculoInterface {
	private Integer numeroDividendo;
	private final int NUMERO_DIVISOR = 5;

	public String calculoNumeroMultiplo(int valorCalculo) {
		if (valorCalculo % NUMERO_DIVISOR == 0) {
			System.out.println("Pro" );
			return "Pro";
		}
		return "";
	}

	public Integer getNumeroDividendo() {
		return numeroDividendo;
	}

	public void setNumeroDividendo(Integer numeroDividendo) {
		this.numeroDividendo = numeroDividendo;
	}

}
