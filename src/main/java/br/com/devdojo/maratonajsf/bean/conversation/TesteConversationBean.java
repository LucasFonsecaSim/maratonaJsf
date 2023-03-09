package br.com.devdojo.maratonajsf.bean.conversation;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ManagedBean
@ConversationScoped
public class TesteConversationBean implements Serializable {
    private Arrays Array;
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    @Inject
    private Conversation conversation;

    public void init(){
        System.out.println(" Entrou no PostConstruct do ConversationScoped ");
        personagens = Array.asList("Luffy","Zoro","Sanji");
        if(conversation.isTransient()){
            conversation.begin();
            System.out.println("Iniciando conversation Scoped, ID= "+ conversation.getId());
        }
    }

    public String endConversation() {
        if (!conversation.isTransient()){
            conversation.end();
        }
        return "conversation?faces-redirect=true";
    }

    public void selecionarPesonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }


    // -------- Metodos get e set --------
    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
