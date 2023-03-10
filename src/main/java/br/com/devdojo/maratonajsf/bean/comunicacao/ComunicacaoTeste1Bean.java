package br.com.devdojo.maratonajsf.bean.comunicacao;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
@ManagedBean
@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {
    private String nome;
    private String sobreNome;
    public void imprimirAtributos(){
        String initParameter = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("images.location");
        System.out.println(initParameter);
    }

    public String save(){
        System.out.println(nome);
        System.out.println(sobreNome);
        return "comunicacao2?faces-redirect=true&nome="+nome+"&sobreNome="+sobreNome;
    }

    /*---Metodos get e set--- */
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
