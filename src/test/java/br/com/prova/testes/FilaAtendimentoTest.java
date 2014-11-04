package br.com.prova.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import br.com.prova.modelo.FilaAtendimento;

public class FilaAtendimentoTest {
	FilaAtendimento fila = new FilaAtendimento();

	@Test
	public void calculaTempoDeAtendimentoDoBanco() {
	}

	@Test
	public void verificaSeValorDeEntradaPossuiMaisDeUmEspacoEmBrancoDeveRetornarAviso() {
		String entradaPrimeiraLinha = "1  5";
		String [] valorTratado = entradaPrimeiraLinha.split(" ");
		assertEquals("Voce inseriu mais de um espaco em branco", 3, valorTratado.length);
	}

	@Test
	public void verificaSeValorDeEntradaPossuiApenasUmEspacoEmBranco() {
		String entradaPrimeiraLinha = "1 5";
		String [] valorTratado = entradaPrimeiraLinha.split(" ");
		assertEquals( 2, valorTratado.length);
	}
	
	@Test
	public void verificaSeExisteCaixasAtivosEMaiorQueUmDisponivel(){
		assertThat(fila.verificaQtdClientesQueAguardaraoAtendimento(10, 11), greaterThanOrEqualTo(1));
	}

	@Test
	public void verificarTempoDeAtendimentoEMaiorQueVinteMinutos(){
		assertThat(fila.tempoDeAtendimento(25), greaterThanOrEqualTo(20));
	}
}
