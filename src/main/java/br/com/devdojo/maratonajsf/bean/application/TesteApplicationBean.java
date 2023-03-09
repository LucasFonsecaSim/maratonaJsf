package br.com.devdojo.maratonajsf.bean.application;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ManagedBean
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;
    private Arrays Array;

    @PostConstruct
    public void init(){
        System.out.println("Entrou no PosConstruct do ApplicationScoped");
        categoriaList = Array.asList("RPG","SCI-FI","Terror");

    }

    public void mudarLista(){
        categoriaList = Array.asList("RPG","SCI-FI","Terror","Ação");
    }
    //--------- Metodos Get e Set ---------
    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
