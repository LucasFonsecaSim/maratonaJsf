package br.com.devdojo.maratonajsf.bean.flow;

import javax.annotation.ManagedBean;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;
@ManagedBean
@Named
@FlowScoped(value="registration")
public class TesteFlowBean implements Serializable {
    private String nome;
    private String sobreNome;
    private String endereco;

    public String salvar(){
        System.out.println("Salvando no banco...");
        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(endereco);
        //return "exitToInicio";
        return "exitToIndex";
    }

    // -------- Metodos get e set --------

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
