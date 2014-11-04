package br.com.prova.executora;

import java.util.Scanner;

import br.com.prova.modelo.Cliente;
import br.com.prova.modelo.FilaAtendimento;

public class FilaAtendimentoBanco {

	private static Scanner entrada;
	private static final String PRIMEIRO_TEXTO_VALOR_ENTRADA = "Digite o numero de caixas ativos e o numero de clientes que serão atendidos no dia. \n"
			+ "Atenção os valores separados por apenas um espaco em branco: \n ";
	private static final String SEGUNDO_TEXTO_VALOR_ENTRADA = "Digite a(s) informacao(es) do(s) cliente(s): Entrada do Cliente na Fila e Tempo Necessario para o atendimento \n"
			+ "Atenção os valores separados por apenas um espaco em branco: \n ";

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println(PRIMEIRO_TEXTO_VALOR_ENTRADA);
		String valorPrimeiraLinha = entrada.nextLine();
		String[] valoresSeparados = valorPrimeiraLinha.split(" ");

		if (valoresSeparados.length == 2) {
			FilaAtendimento filaAtendimento = new FilaAtendimento();
			filaAtendimento.setCaixasAtivos(Integer
					.parseInt(valoresSeparados[0]));
			filaAtendimento.setNumeroClientes(Integer
					.parseInt(valoresSeparados[1]));

			for (int i = 0; i < filaAtendimento.getNumeroClientes(); i++) {
				entrada = new Scanner(System.in);
				System.out.println(SEGUNDO_TEXTO_VALOR_ENTRADA);
				String valorSegundaLinha = entrada.nextLine();
				valoresSeparados = valorSegundaLinha.split(" ");
				Cliente cliente = new Cliente();
				cliente.setEntradaNaFila(Integer.parseInt(valoresSeparados[0]));
				cliente.setTempoParaAtendimento(Integer
						.parseInt(valoresSeparados[1]));
				filaAtendimento.getInformacoesCliente().add(cliente);
			}

			int posicao = 0;
			int valorSaida = 0;
			int valorCaixasAtivos = 0;
			int ultimoTempoAtendimento = 0;
			while (filaAtendimento.getCaixasAtivos() > valorCaixasAtivos) {
				ultimoTempoAtendimento = filaAtendimento.getInformacoesCliente().get(valorCaixasAtivos).getTempoParaAtendimento();
				filaAtendimento.getInformacoesCliente().remove(valorCaixasAtivos);
				valorCaixasAtivos = valorCaixasAtivos + 1;
			}
			
			for (Cliente cliente : filaAtendimento.getInformacoesCliente()) {
				
				if(ultimoTempoAtendimento > 0){
					cliente.setTempoParaAtendimento(ultimoTempoAtendimento);
					ultimoTempoAtendimento = 0;
				}else {
					int valor = filaAtendimento.getInformacoesCliente().get(posicao - 1).getTempoParaAtendimento() - cliente.getEntradaNaFila() + cliente.getTempoParaAtendimento();
					cliente.setTempoParaAtendimento(valor);
				}
				
				if (cliente.getTempoParaAtendimento() > 20) {
					valorSaida = valorSaida + 1;
				}
				posicao++;
			}
			System.out.println(valorSaida);
		} else {
			System.out
					.println("Voce forneceu os valores com mais de um espaço em branco.");
		}
	}
}
