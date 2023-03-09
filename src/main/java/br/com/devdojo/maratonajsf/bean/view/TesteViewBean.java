package br.com.devdojo.maratonajsf.bean.view;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@ManagedBean
@Named
@ViewScoped
public class TesteViewBean implements Serializable {
    private Arrays Array;
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    @PostConstruct
    public void init(){
        System.out.println(" Entrou no PostConstruct do ViewScoped ");
        personagens = Array.asList("Naruto","Hinata","Yondaime");
    }

    public void selecionarPesonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
