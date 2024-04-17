package executavel;

public class classeExecutavel {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Leno");
		aluno.setIdade(22);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("idade: " + aluno.getIdade());
	}

}
