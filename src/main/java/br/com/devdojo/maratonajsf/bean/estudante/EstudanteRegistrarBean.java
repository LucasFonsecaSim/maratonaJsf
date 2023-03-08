package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

@Named
@ManagedBean
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomeArray = {"DevDojo", "Teste1", "Teste2"};
    private List<String> nomeLista = Arrays.asList("Lucas", "Teste1", "Teste2");
    private Set<String> nomeSet = new HashSet<>(Arrays.asList("Lucas", "TesteSet", "TesteSet2"));
    private Map<String, String> nomeMap = new HashMap<>();

    {
        nomeMap.put("Lucas1","TesteMap 1");
        nomeMap.put("Lucas2","TesteMap 2");
        nomeMap.put("Lucas3","TesteMap 3");
    //    for (Map.Entry<String, String> entry:nomeMap.entrySet()){
    //        System.out.println(entry.getKey());
    //        System.out.println(entry.getValue());
    //    }
    }

    public void executar(){
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String param){
        System.out.println("Fazendo uma busca no BD "+param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }
    public Map<String, String> getNomeMap() {
        return nomeMap;
    }

    public void setNomeMap(Map<String, String> nomeMap) {
        this.nomeMap = nomeMap;
    }

    public Set<String> getNomeSet() {
        return nomeSet;
    }

    public void setNomeSet(Set<String> nomeSet) {
        this.nomeSet = nomeSet;
    }

    public List<String> getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(List<String> nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String[] getNomeArray() {
        return nomeArray;
    }

    public void setNomeArray(String[] nomeArray) {
        this.nomeArray = nomeArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
