package org.example.t09;

public class Habito {
    private Pessoa dono;
    private String descricao;
    public Habito(Pessoa dono){
        this.dono = dono;
        dono.novoHabito(this);
    }
}
