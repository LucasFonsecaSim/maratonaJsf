package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.cdi.Param;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean
@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable {
    @Inject @Param(name = "nome")
    private String nome;
    @Inject @Param(name = "sobreNome")
    private String sobreNome;
    @PostConstruct
    public void init(){
        System.out.println("criou comunicacao 2");
      //  Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
      //  nome = paramsMap.get("nome");
      //  sobreNome = paramsMap.get("sobreNome");
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
