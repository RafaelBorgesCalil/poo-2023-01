package org.example.pratica04;

public class TestaLivro {
    public static void main(String[] args) {
        Livro[] livros  = new Livro[3];
        livros[0] = new Livro("Happy place", "Emily Henry", (Integer)2023, "Berkley");
        livros[1] = new Livro("Lessons in chemistry", "Bonnie Garmus", (Integer)2022, "Doubleday");
        livros[2] = new Livro("The last thing he told me", "Laura Dave", (Integer)2021, "Simon & Schuster");

        for(int i = 0; i < livros.length; i++){
            System.out.println("titulo: " + livros[i].getTitulo() + "\nautor: " + livros[i].getAutor() + "\nEditora: "
                + livros[i].getEditora() + "\nAno: " + livros[i].getAno().toString());
        }
    }
}
