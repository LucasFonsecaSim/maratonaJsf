package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.util.Faces;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@ManagedBean@Named@ViewScoped
public class ComunicacaoTeste9Bean implements Serializable {
    private String value;
    public void init(){
        value = Faces.getRequestCookie("nome");
    }

    /* Metodos Get e Set*/

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
