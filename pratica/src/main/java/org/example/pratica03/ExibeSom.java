public class ExibeSom implements Operacao {
    public void executa(Object obj) {
        System.out.println(((Animal)obj).som());
    }
    void executaOperacao(Animal[] animais, Operacao operacao) {
        for (Animal a : animais) {
            op.executa(a);
        }
    }
}