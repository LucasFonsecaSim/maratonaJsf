package br.com.devdojo.maratonajsf.bean.login;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
@ManagedBean
@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String nome;
    private String senha;
    private Estudante estudante;
    private String string;

    public String logar(){
        //Faz uma busca no banco de dados
        if (nome.equals("w")&&senha.equals("1")){
            estudante = new Estudante();
            return "/restricted/inicioSistema.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuario e/ou senha invalidos", ""));
        return null;
    }
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        estudante=null;
        return "/login?faces-redirect=true";
    }
    /* -------- Metodos get e set -------- */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
