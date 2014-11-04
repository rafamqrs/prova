package br.com.prova.modelo;

public class Cliente {

	private Integer entradaNaFila;
	private Integer tempoParaAtendimento;

	public Cliente() {
	}

	public Integer getEntradaNaFila() {
		return entradaNaFila;
	}

	public void setEntradaNaFila(Integer entradaNaFila) {
		this.entradaNaFila = entradaNaFila;
	}

	public Integer getTempoParaAtendimento() {
		return tempoParaAtendimento;
	}

	public void setTempoParaAtendimento(Integer tempoParaAtendimento) {
		this.tempoParaAtendimento = tempoParaAtendimento;
	}
}
