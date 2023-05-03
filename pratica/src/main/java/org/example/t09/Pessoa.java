package org.example.t09;
import java.util.ArrayList;
public class Pessoa {
    private ArrayList<Habito> habitos;
    private String nome;
    private int idade;
    public void novoHabito(Habito habito){
        habitos.add(habito);
    }
}
