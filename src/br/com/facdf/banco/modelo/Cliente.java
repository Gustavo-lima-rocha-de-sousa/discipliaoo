package br.com.facdf.banco.modelo;

public class Cliente extends Pessoa {

    private long codigoCliente;

    public boolean ehEspecial;

    public long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    public void realizarCadastro(String msg) {

    }

    public void realizarCadastro(int msg) {
    
    }
    
}