package br.com.devdojo.maratonajsf.bean.session;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@ManagedBean
@Named
@SessionScoped
public class TesteSessionBean implements Serializable {
    private Arrays Array;
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    @PostConstruct
    public void init(){
        System.out.println(" Entrou no PostConstruct do SessionScoped ");
        personagens = Array.asList("Goku","Vegeta","Gohan");
    }

    public void selecionarPesonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
