package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
@ManagedBean@Named@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {
    private String buttonName= "Nome do botão do bean";
    private Estudante estudante = new Estudante();



    public void execute(ActionEvent event){
        String nome = (String) event.getComponent().getAttributes().get("nome");
        String adjetivo = (String) event.getComponent().getAttributes().get("adjetivo");
        Estudante estudante = (Estudante) event.getComponent().getAttributes().get("estudante");
        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudante.getNome());
    }

    /*Metodos get e set*/

    public Estudante getEstudante() {
        return estudante;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
