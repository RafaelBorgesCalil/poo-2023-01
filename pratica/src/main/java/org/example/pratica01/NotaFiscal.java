package org.example.pratica01;
public class NotaFiscal {
    private ItemNotaFiscal[] itens;
    public float getTotal(){
        float total = 0;
        for (int i = 0; i < itens.length; i++){
            total += itens[i].getTotal();
        }
        return total;
    }
}
