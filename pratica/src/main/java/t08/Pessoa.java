package t08;

import java.util.ArrayList;

public class Pessoa {
	private ArrayList<Emprego> empregos;
	private String  nome;
	public String getNome() {
		return  nome;
	}
	public Empresa getEmpregos() {
		return  ((Emprego) empregos.iterator()).getEmpresa();
	}
}
