package br.com.prova.modelo;

public class ArvoreBinaria {

	private No raiz;
	private ArvoreBinaria arvoreEsquerda;
	private ArvoreBinaria arvoreDireita;

	public ArvoreBinaria() {
	}

	public ArvoreBinaria getArvoreDireita() {
		return arvoreDireita;
	}

	public void setArvoreDireita(ArvoreBinaria arvoreDireita) {
		this.arvoreDireita = arvoreDireita;
	}

	public ArvoreBinaria getArvoreEsquerda() {
		return arvoreEsquerda;
	}

	public void setArvoreEsquerda(ArvoreBinaria arvoreEsquerda) {
		this.arvoreEsquerda = arvoreEsquerda;
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public void inserir(No no) {
		if (this.raiz == null) {
			this.raiz = no;
		} else {
			if (no.getLivro().getMatricula() > this.raiz.getLivro()
					.getMatricula()) {
				if (this.arvoreDireita == null) {
					this.arvoreDireita = new ArvoreBinaria();
				}
				this.arvoreDireita.inserir(no);
			} else if (no.getLivro().getMatricula() < this.raiz.getLivro()
					.getMatricula()) {
				if (this.arvoreEsquerda == null) {
					this.arvoreEsquerda = new ArvoreBinaria();
				}
				this.arvoreEsquerda.inserir(no);
			}
		}
	}
}
