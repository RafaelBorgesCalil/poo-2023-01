package t08;

import java.util.ArrayList;

public class Pais {
	private ArrayList<Cidade> cidades;
	private Cidade capital;
	
	public Pais  (Cidade c) {
		cidades.add(c);
		this.setCapital(c);
	}
	
	public void setCapital(Cidade c) {
		this.capital = c;
	}
	public void novaCidade(Cidade c) {
		cidades.add(c);
	}
}
