package ConsultorioMedico;

public class Pessoa {
	
	//Atributos
	String nome;
	double altura;
	double peso;
	String nacionalidade;
	double quantidadeKmCorrida;
	double horaDeSono;
	
	void correr(double valorCorrida) {
		this.quantidadeKmCorrida = this.quantidadeKmCorrida + valorCorrida;
	}
	
	void dormir(double valorSono) {
		this.horaDeSono = this.horaDeSono + valorSono;
	}
}


