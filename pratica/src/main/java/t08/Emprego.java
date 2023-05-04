package t08;

import java.util.Date;

public class Emprego {
	private float salario;
	private Pessoa empregado;
	private Empresa empresa;
	private Date inicio;
	private Date fim;
	public Pessoa  getEmpregado() {
		return empregado;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
}
