package br.com.facdf.banco.modelo;

public class Conta  {

    private double saldo;
    private String codigoConta;
    private String agencia;
    private String codigoSeguranca;

    public Conta() {

    }

    public Conta(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public Conta(String codigoSeguranca, String codigoConta) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public Conta(double saldo, String codigoConta, String agencia, String codigoSeguranca) {
        this.saldo = saldo;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
        this.codigoSeguranca = codigoSeguranca;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCodigoSeguranca() {

            return codigoSeguranca;

    }

    public String toString() {
        return " Conta " + this.codigoConta;

    }

}