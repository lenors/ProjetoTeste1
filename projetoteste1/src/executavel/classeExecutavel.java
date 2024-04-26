package executavel;

import javax.swing.JOptionPane;

public class classeExecutavel {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?  ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
		String registroGeral = JOptionPane.showInputDialog("Qual o registro Geral do aluno? ");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?  ");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno? ");
		String dataMatricula = JOptionPane.showInputDialog("Em que periodo o aluno foi matriculado?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno? ");
//
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
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota Da disciplina" + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno1.getDisciplinas().add(disciplina);
		}

		System.out.println(aluno1.toString());
		System.out.println("Media do aluno = " + aluno1.getMedianota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());

		/* Equals e hashcode (Diferenciar e comparar objetos) */

	}

}
