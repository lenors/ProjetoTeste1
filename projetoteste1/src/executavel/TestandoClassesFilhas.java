package executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leno Rafael");
		aluno.setDataMatricula("20/02/1997");
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Alex-java");
		diretor.setRegistroGeral("654486");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		
		System.out.println(aluno);
	}
}
