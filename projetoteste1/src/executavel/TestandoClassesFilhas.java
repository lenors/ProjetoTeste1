package executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leno Rafael");
		aluno.setDataMatricula("20/02/1997");
		aluno.setIdade(22);
		
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Alex-java");
		diretor.setRegistroGeral("654486");
		diretor.setIdade(55);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcio");
		secretario.setExperiencia("Administracao");
		secretario.setIdade(33);
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println("Salario e = " + secretario.salario());
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
		
	
	}
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e demais = " + pessoa.getNome() +"E o salario e de " + pessoa.salario());
	}
}
