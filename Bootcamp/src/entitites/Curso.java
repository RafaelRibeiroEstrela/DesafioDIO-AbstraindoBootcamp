package entitites;

import entitites.enums.NivelEnum;

import java.util.LinkedHashSet;
import java.util.Set;

public class Curso {
    private String nome;
    private String nivel;
    private Integer horas;
    private Set<Aula> aulas = new LinkedHashSet<>();

    public Curso(){

    }

    public Curso(String nome, NivelEnum nivel, Integer horas) {
        this.nome = nome;
        this.nivel = nivel.getDesc();
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", nivel='" + nivel + '\'' +
                ", horas='" + horas + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
