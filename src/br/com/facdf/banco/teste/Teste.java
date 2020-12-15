package br.com.facdf.banco.teste;

import br.com.facdf.banco.dao.ContaDao;
import br.com.facdf.banco.modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {

    public static void main (String args []) {

        Gerente gerente = new Gerente();
        gerente.pagarSalario(6000d);
        System.out.println(gerente.getSalario());


        Programador programador = new Programador();
        programador.pagarSalario(2000d);
        System.out.println("Salario programador " +programador.getSalario());


        Conta conta = new Conta();

        ContaDao dao = new ContaDao();
        dao.deletar(conta);


        List<Pessoa> listaPessoas = new ArrayList<>();

        Endereco endereco = new Endereco();
        endereco.setLogradouro("rua 50");

        Pessoa cliente = new Cliente();
        cliente.setNome("ruan");
        listaPessoas.add(cliente);
        cliente.setEndereco(endereco);

        Pessoa cliente2 = new Cliente();
        cliente.setNome("milton");
        cliente.setEndereco(endereco);

        Dependente dependente = new Dependente();
        dependente.setNome("marcos");
        dependente.setCodigoDependente(15464);
        dependente.setCliente((Cliente)cliente);

        Date date = new Date();
        Dependente dependente2 = new Dependente();
        dependente.setDataNascimento(date);
        dependente2.setNome("julia");
        dependente2.setCodigoDependente(15464);
        dependente2.setCliente((Cliente)cliente);

        imprimirInformacoesDependente(dependente);

        imprimirInformacoesDependente(dependente2);

    }

    private static void imprimirInformacoesDependente(Dependente qualquerDependente) {
        System.out.println(qualquerDependente.getNome());
        System.out.println(qualquerDependente.getCliente().getNome());
        System.out.println(qualquerDependente.getCliente().getEndereco().getLogradouro());
    
    }

}