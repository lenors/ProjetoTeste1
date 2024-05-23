package executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/* Usado para executar codigo */
	public static void main(String[] args) {
	Aluno aluno = new Aluno();
	
	aluno.setNome("Leno");
	aluno.setNomeEscola("Jdev Treinamento");
	
	
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso de Java");
	
	double[] notas = {8.8, 9,7, 8.9, 7.8};
	double[] notasLogica = {10.9, 9,7, 8.7, 7.8};

	disciplina.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina);
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Logica de programacao");
	disciplina2.setNota(notasLogica);
	}
}
