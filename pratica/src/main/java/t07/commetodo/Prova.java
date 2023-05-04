package t07.commetodo;

public class Prova {
	public byte numQuestoes;

	public byte getNumQuestoes() {
		return numQuestoes;
	}

	public void setNumQuestoes(byte n) {
		if  (n>0) {
			this.numQuestoes = n;
		}
	}
	
}
