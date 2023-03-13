package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean@Named@ViewScoped
public class ComunicacaoTeste7Bean implements Serializable {
    private Estudante estudante;
    public void init(){
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        estudante = (Estudante) flash.get("estudante");
    }

    /* Metodos Get e Set */

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
