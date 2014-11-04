package br.com.prova.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.prova.modelo.NumeroPro;
import br.com.prova.modelo.NumeroProTeste;
import br.com.prova.modelo.NumeroTeste;

public class NumeroTest {

	@Test
	public void divisaoDoNumeroPorSeteDeveRetornarStringTeste() {
		NumeroTeste teste = new NumeroTeste();
		assertEquals("Teste", teste.calculoNumeroMultiplo(14));
	}

	@Test
	public void divisaoDoNumeroPorCincoDeveRetornarStringPro() {
		NumeroPro pro = new NumeroPro();
		assertEquals("Pro", pro.calculoNumeroMultiplo(10));
	}

	@Test
	public void divisaoDoNumeroPorTrintaECincoDeveRetornarStringProTeste() {
		NumeroProTeste proTeste = new NumeroProTeste();
		assertEquals("Proteste", proTeste.calculoNumeroMultiplo(70));
	}
	@Test
	public void divisaoDoNumeroTrintaECincoPelosTresNumeroCincoSeteETrintaCincoDeveRetornarTresStrings() {
		NumeroProTeste proTeste = new NumeroProTeste();
		assertEquals("Proteste", proTeste.calculoNumeroMultiplo(35));

		NumeroPro pro = new NumeroPro();
		assertEquals("Pro", pro.calculoNumeroMultiplo(35));

		NumeroTeste teste = new NumeroTeste();
		assertEquals("Teste", teste.calculoNumeroMultiplo(35));

	}
}
