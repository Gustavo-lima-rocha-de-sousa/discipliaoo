package br.com.facdf.banco.modelo;

public class AnalistaDeRequisitos extends Funcionario implements Autenticavel{

    public double getBonificacao() {
        return this.salario += this.salario * 0.2;
    }

    public void entregarDocumentos() {

    }

    public void levantarRequisitos() {
        System.out.println("levantando requisitos");
    }

    public boolean autentica(String senha) {
        return false;
    }

    public void trocarSenha(String senha) {

    }
    
}