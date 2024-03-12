package Modelagem;
import Negocios.Vetor;
public class Aluno {
	public String nome;
	public double matricula;
	public int idade;
	double nota;

	public Aluno() {
		
	}

	public Aluno(String nome, double matricula, int idade, double nota) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

		
	

	
	
	


}
