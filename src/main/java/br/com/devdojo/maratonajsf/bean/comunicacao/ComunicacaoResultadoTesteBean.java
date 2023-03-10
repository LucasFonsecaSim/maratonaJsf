package br.com.devdojo.maratonajsf.bean.comunicacao;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean@Named@ViewScoped
public class ComunicacaoResultadoTesteBean implements Serializable {
    private String nome;
    private String sobreNome;
    public void init(){
        System.out.println("criou comunicacao 3");
        System.out.println(nome);
        System.out.println(sobreNome);
    }

    /* --- metodos get e set --- */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
