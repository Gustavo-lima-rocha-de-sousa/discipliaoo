package br.com.facdf.banco.modelo;

import java.util.Date;

public abstract class Pessoa {

	public Pessoa(String rg, String nome) {
		this.rg = rg;
		this.nome = nome;
	}

	public Pessoa() {

	}

	private Date dataNascimento;
	private int idade;
	private String rg;	
	private String nome;
	private Endereco endereco;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idadeDigitada) {
		this.idade = idadeDigitada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeDigitado) {
		this.nome = nomeDigitado;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	
	}

}