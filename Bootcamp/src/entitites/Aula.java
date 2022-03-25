package entitites;

import java.util.Arrays;

public class Aula {

    private String nome;
    private byte[] conteudo;

    public Aula(){

    }

    public Aula(String nome, byte[] conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nome='" + nome + '\'' +
                ", conteudo=" + Arrays.toString(conteudo) +
                '}';
    }
}
