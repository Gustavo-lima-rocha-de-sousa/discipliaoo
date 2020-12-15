package br.com.facdf.banco.modelo;

public interface Autenticavel {

     boolean autentica(String senha);

     void trocarSenha(String senha);
     
}