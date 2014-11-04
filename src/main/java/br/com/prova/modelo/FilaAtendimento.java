package br.com.prova.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilaAtendimento {

	private Integer caixasAtivos;
	private Integer numeroClientes;
	private LinkedList<Cliente> informacoesCliente = new LinkedList<Cliente>();

	public FilaAtendimento() {
	}

	public Integer getCaixasAtivos() {
		return caixasAtivos;
	}

	public void setCaixasAtivos(Integer caixasAtivos) {
		if (caixasAtivos != null)
			this.caixasAtivos = caixasAtivos;
	}

	public Integer getNumeroClientes() {
		return numeroClientes;
	}

	public void setNumeroClientes(Integer numeroClientes) {
		if (numeroClientes != null)
			this.numeroClientes = numeroClientes;
	}

	public LinkedList<Cliente> getInformacoesCliente() {
		return informacoesCliente;
	}

	public void setInformacoesCliente(LinkedList<Cliente> informacoesCliente) {
		this.informacoesCliente = informacoesCliente;
	}

	public boolean verificaSeEntradaPossuiApenasUmEspaco(String entrada) {
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(entrada);
		boolean valorCorreto = matcher.find();
		return valorCorreto;
	}

	public int verificaQtdClientesQueAguardaraoAtendimento(Integer caixasAtivos,
			Integer qtdClientes) {
		int clienteAtendimentoNaHora = caixasAtivos - qtdClientes;
		if(clienteAtendimentoNaHora < 0)
			clienteAtendimentoNaHora *= -1;
		return clienteAtendimentoNaHora;
	}
	
	public int tempoDeAtendimento(int tempo){
		if(tempo > 20){
			tempo = tempo + 1;
			return tempo;
		}
		return tempo;
	}
}
