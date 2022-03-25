package entitites;

import entitites.enums.NivelEnum;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String nivel;
    private Integer horas;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Usuario> desenvolvedores = new LinkedHashSet<>();

    public Bootcamp(){

    }

    public Bootcamp(String nome, NivelEnum nivel, Integer horas, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.nivel = nivel.getDesc();
        this.horas = horas;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelEnum getNivel() {
        return NivelEnum.toEnum(nivel);
    }

    public void setNivel(NivelEnum nivel) {
        this.nivel = nivel.getDesc();
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public Set<Usuario> getDesenvolvedores() {
        return desenvolvedores;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", nivel='" + nivel + '\'' +
                ", horas=" + horas +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", cursos=" + cursos +
                ", desenvolvedores=" + desenvolvedores +
                '}';
    }
}
