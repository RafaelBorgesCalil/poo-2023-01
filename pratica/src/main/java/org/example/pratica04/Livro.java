package org.example.pratica04;

public class Livro {
    private String titulo;
    private String autor;
    private Integer ano;
    private String editora;

    public Livro(String titulo, String autor, Integer ano,String editora){
        setAno(ano);
        setAutor(autor);
        setEditora(editora);
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
