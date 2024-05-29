package executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/* Usado para executar codigo */
	public static void main(String[] args) {
		// Array Notas
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 5.8, 10.7, 4.6, 9.8 };
		// Criacao Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Leno Rafael");
		aluno.setNomeEscola("Jdev Treinamentos");

		// Criacao disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Progamacao");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);

		
			Aluno[] arrayAlunos = new Aluno[1];
			arrayAlunos[0] = aluno;
			
			for(int pos = 0; pos < arrayAlunos.length; pos++) {
				System.out.println("Nome do aluno  e: " + arrayAlunos[pos].getNome());
				for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
					System.out.println("Nome da Disciplina " + d.getDisciplina());
					
					for(int posNota = 0; posNota < d.getNota().length; posNota++) {
						System.out.println("As notas sao " + posNota + "e igual a " + d.getNota()[posNota]);
					}
				}
			}
		
		}

	}

