package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;
import br.com.devdojo.maratonajsf.util.ApplicationMapUtil;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean@Named@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {
    private Estudante estudante;

    public void init(){
        estudante = (Estudante)ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }
    /* Metodos get e set */

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
