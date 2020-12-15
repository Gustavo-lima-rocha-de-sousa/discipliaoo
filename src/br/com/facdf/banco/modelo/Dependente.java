package br.com.facdf.banco.modelo;

public class Dependente extends Pessoa {

    private int codigoDependente;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigoDependente() {
        return codigoDependente;
    }

    public void setCodigoDependente(int codigoDependente) {
        this.codigoDependente = codigoDependente;
    }

    public void solicitarServicoDependente() {
        System.out.println("Algo que só o dependente pode fazer");
    
    }
    
}