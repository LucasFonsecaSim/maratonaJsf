package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean@Named@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {
    private List<Estudante> estudanteList = Estudante.estudanteList();

    public String editar(int index){
        Estudante estudante = estudanteList.get(index);
        Flash flash =FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("estudante", estudante);
        return "comunicacao7?faces-redirect=true";
    }


    /* Metodos get e set */
    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudantesList) {
        this.estudanteList = estudantesList;
    }

}
