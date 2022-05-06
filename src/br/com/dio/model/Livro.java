package br.com.dio.model;

public class Livro {
    private String nome;
    private Integer pags;

    public Livro() {
    }

    public Livro(String nome, Integer pags) {
        this.nome = nome;
        this.pags = pags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPags() {
        return pags;
    }

    public void setPags(Integer pags) {
        this.pags = pags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", pags=" + pags +
                '}';
    }
}
