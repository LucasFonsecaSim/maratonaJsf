package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
@Named
@ManagedBean
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
