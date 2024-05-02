package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;

public class classeExecutavel {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno? " + qtd + "?");
//		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?  ");
//		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
//		String registroGeral = JOptionPane.showInputDialog("Qual o registro Geral do aluno? ");
//		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?  ");
//		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno? ");
//		String dataMatricula = JOptionPane.showInputDialog("Em que periodo o aluno foi matriculado?");
//		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno? ");
////
//		String serieEscola = JOptionPane.showInputDialog("Qual a serie do elemento?");
//		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
//
//		String nota1 = JOptionPane.showInputDialog("Qual a primeira nota? : ");
//		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
//
//		String nota2 = JOptionPane.showInputDialog("Qual a segunda nota? : ");
//		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
//
//		String nota3 = JOptionPane.showInputDialog("Qual a terceira nota? : ");
//
//		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
//		String nota4 = JOptionPane.showInputDialog("Qual a quarta nota? : ");

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(registroGeral);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNomeMae(nomeMae);
//		aluno1.setDataMatricula(dataMatricula);
//		aluno1.setNomeEscola(nomeEscola);

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota Da disciplina" + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual e a disciplina, 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
				}
			}
			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) { /* Separei em Listas */
			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);
			}
			System.out.println("---------------Lista dos aprovados--------------------");
			for (Aluno aluno2 : alunosAprovados) {
				System.out.println("Nome + " + aluno.getNome() + "Resultado = " + aluno.getAlunoAprovado()
						+ "com media de = " + aluno.getMedianota());
			}
			System.out.println("-----------------Lista dos reprovados---------------");
			for (Aluno aluno2 : alunosReprovados) {
				System.out.println("Nome + " + aluno.getNome() + "Resultado = " + aluno.getAlunoAprovado()
						+ "com media de = " + aluno.getMedianota());
			}
			System.out.println("-----------------Lista dos recuperacao---------------");
			for (Aluno aluno2 : alunosRecuperacao) {
				System.out.println("Nome + " + aluno.getNome() + "Resultado = " + aluno.getAlunoAprovado()
						+ "com media de = " + aluno.getMedianota());
			}
		}
	}

	/* Equals e hashcode (Diferenciar e comparar objetos) */

}
