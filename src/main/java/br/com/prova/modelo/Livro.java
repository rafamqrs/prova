package br.com.prova.modelo;

public class Livro {

	private int matricula;
	private String nome;

	public Livro(int mat, String nome) {
		this.matricula = mat;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int mat) {
		this.matricula = mat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
