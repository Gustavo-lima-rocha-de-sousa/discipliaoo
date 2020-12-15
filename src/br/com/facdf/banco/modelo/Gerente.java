package br.com.facdf.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel, RecebeBeneficios {

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() > 4) {
            this.senha = senha;
        }
    }

    public double getBonificacao() {

        return super.salario += super.salario * 0.2;
    }

    public final void pagarSalario(Double salario) {
        if (salario > 5000) {
            this.salario = salario;
        } else {
            System.out.println("Salário deve ser maior que 5000 ");
        }
    }

    public boolean autentica(String senha) {
        if (this.senha.equalsIgnoreCase(senha)) {
            System.out.println("atenticado!!");
            return true;
        } else {
            System.out.println("senha errada");
            return false;
        }
    }

    
    public String toString() {
        return " Gerente " + this.getSenha();
    }

   
    public void entregarDocumentos() {

    }

    public void trocarSenha(String senha) {
       this.senha = senha;
    }
}
