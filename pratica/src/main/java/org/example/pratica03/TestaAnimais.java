package org.example.pratica02;
public class TestaAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Boi();
        animais[2] = new Cachorro();

        executaOperacao(animais, new ExibeSom());
    }
}
