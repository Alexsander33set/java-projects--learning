package learning1;

public class avaliacao {
	private double nota1,nota2;
	
	public avaliacao( double score1,double score2) {
		this.nota1 = score1;
		this.nota2 = score2;
	}
	public double mediaAritmetica() {
		return (nota1+nota2)/2;
	}
	public double mediaPonderada() {
		return (nota1*2+nota2*3)/5;
	}
}
