package org.example.pratica01;
public class ItemNotaFiscal extends NotaFiscal{
    private int quantidade;
    private Produto produto;
    public float getTotal(){
        float precoComImposto = this.produto.getPreco() * this.produto.getAliquota();
        return (precoComImposto * this.quantidade);
    }
}
