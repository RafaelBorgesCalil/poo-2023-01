package t08;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Emprego> vagas;
	private String nomeFantasia;
	public String getNomeFantasia() {
		return  nomeFantasia;
	}
	public Pessoa getEmpregados() {
		return ((Emprego) vagas.iterator()).getEmpregado();
	}
}
