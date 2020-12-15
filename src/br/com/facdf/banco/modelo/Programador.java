package br.com.facdf.banco.modelo;

public class Programador extends Funcionario implements Autenticavel {

    public double getBonificacao() {
        return this.salario += this.salario * 0.1;
    }

    public void entregarDocumentos() {

    }

    public void programar(){

        System.out.println("Enviar documentos por e-mail");
    }

    public void update(){

    }

    public boolean autentica(String senha) {
        return false;
    }

    public void trocarSenha(String senha) {

    }
    
}