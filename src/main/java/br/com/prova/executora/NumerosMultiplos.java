package br.com.prova.executora;

import br.com.prova.modelo.NumeroPro;
import br.com.prova.modelo.NumeroProTeste;
import br.com.prova.modelo.NumeroTeste;

/**
 * Classe para Executar o exercicio de Número 1 da prova ProTeste
 *
 */
public class NumerosMultiplos {

	public static void main(String[] args) {
		String valorPro = "";
		String valorTeste = "";
		String valorProTeste = "";
		NumeroPro pro = new NumeroPro();
		NumeroTeste teste = new NumeroTeste();
		NumeroProTeste proTeste = new NumeroProTeste();
		int i = 1;
		while(i <= 100){
		pro.setNumeroDividendo(i);
			valorPro = pro.calculoNumeroMultiplo(pro.getNumeroDividendo());

			teste.setNumeroDividendo(i);
			valorTeste = teste
					.calculoNumeroMultiplo(teste.getNumeroDividendo());

			proTeste.setNumeroDividendo(i);
			valorProTeste = proTeste.calculoNumeroMultiplo(proTeste
					.getNumeroDividendo());

			if (valorPro.isEmpty() && valorTeste.isEmpty()
					&& valorProTeste.isEmpty())
				System.out.println(i);
			
			i++;
		}
	}
}
