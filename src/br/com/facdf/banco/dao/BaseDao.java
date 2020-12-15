package br.com.facdf.banco.dao;


import java.util.ArrayList;
import java.util.List;

public class BaseDao {

    public void salvar(Object object) {
        if (object != null) {
            System.out.println("Salvando" + object.toString());
        }
    }

    public void deletar(Object conta) {
        System.out.println("deletando");
    }

    public void atualizar(Object conta) {
        System.out.println("atualizando");
    }

    public List<Object> listar() {
        return new ArrayList<>();
    }

    
}
