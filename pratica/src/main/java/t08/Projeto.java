package t08;

import java.util.ArrayList;

public class Projeto {
	private ArrayList<LinguagemDeProgramacao> linguagens;
	private ArrayList<Pessoa> pessoas;
	
	public void novaLinguagem(LinguagemDeProgramacao l) {
		linguagens.add(l);
	}
	
	public void novaPessoa(Pessoa p) {
		pessoas.add(p);
	}
}
