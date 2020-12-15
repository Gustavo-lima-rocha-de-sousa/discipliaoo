package br.com.facdf.banco.modelo;

public class Endereco {

    private String cep;
    private String logradouro;
    private long numero;
    private boolean isComercial;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public long getNumero() {
        return numero;
    }

    public boolean isComercial() {
        return isComercial;
    }

    public void setComercial(boolean comercial) {
        isComercial = comercial;
    }

    public void setNumero(long numero) {
        if (numero > 0) {
            this.numero = numero;
        
        }
    
    }

}