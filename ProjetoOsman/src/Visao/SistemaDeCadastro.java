package Visao;
import javax.swing.JOptionPane;
import Negocios.Vetor;
import Modelagem.Aluno;
		
public class SistemaDeCadastro {
	

	public static void main(String[] args) {
		
		Aluno Aluno1 = new Aluno();
		Aluno Aluno2 = new Aluno();
		Aluno Aluno3 = new Aluno();
		
		JOptionPane.showMessageDialog(null,"Informações do Primeiro Aluno");
		Aluno1.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno:"));
		Aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno:")));
		Aluno1.setMatricula(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a matricula do aluno:")));
		Aluno1.setNota(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do aluno:")));
				
		Vetor aluno1 = new Vetor();
		aluno1.adcionarAluno(0, Aluno1);
		aluno1.adcionarIdade(0, Aluno1);
		aluno1.adcionarMatricula(0, Aluno1);
		aluno1.adcionarNota(0, Aluno1);
		
		
		String informacoes= "Nome:"+Aluno1.getNome()+"\n"+ "Idade:"+Aluno1.getIdade()+"\n"+"Matricula:"+Aluno1.getMatricula()+"\n"+"Nota:"+Aluno1.getNota();
		JOptionPane.showMessageDialog(null, informacoes); 
		
		
		JOptionPane.showMessageDialog(null,"Informações do Segundo Aluno");
		Aluno2.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno:"));
		Aluno2.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno:")));
		Aluno2.setMatricula(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a matricula do aluno:")));
		Aluno2.setNota(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do aluno:")));
				
		Vetor aluno2 = new Vetor();
		aluno2.adcionarAluno(1, Aluno2);
		aluno2.adcionarIdade(1, Aluno2);
		aluno2.adcionarMatricula(1, Aluno2);
		aluno2.adcionarNota(1, Aluno2);
		
		
		informacoes= "Nome:"+Aluno2.getNome()+"\n"+ "Idade:"+Aluno1.getIdade()+"\n"+"Matricula:"+Aluno1.getMatricula()+"\n"+"Nota:"+Aluno1.getNota();
		JOptionPane.showMessageDialog(null, informacoes); 

		JOptionPane.showMessageDialog(null,"Informações do Terceiro Aluno");
		Aluno3.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno:"));
		Aluno3.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno:")));
		Aluno3.setMatricula(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a matricula do aluno:")));
		Aluno3.setNota(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota do aluno:")));
				
		Vetor aluno3 = new Vetor();
		aluno3.adcionarAluno(2, Aluno3);
		aluno3.adcionarIdade(2, Aluno3);
		aluno3.adcionarMatricula(2, Aluno3);
		aluno3.adcionarNota(2, Aluno3);
		
		
		informacoes= "Nome:"+Aluno3.getNome()+"\n"+ "Idade:"+Aluno1.getIdade()+"\n"+"Matricula:"+Aluno1.getMatricula()+"\n"+"Nota:"+Aluno1.getNota();
		JOptionPane.showMessageDialog(null, informacoes); 
		
		
		
		
		
	}


}