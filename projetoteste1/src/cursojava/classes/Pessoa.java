package cursojava.classes;

public abstract class Pessoa {
	
	/*Classe Pai, classe master, atributos comuns a todos os objetos filhos*/
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String nomeMae;
	protected String nomePai;
	protected String numeroCpf;
	/*Metodo abstrato que fica na classe pai, e obrigatorio para classes filhas*/
	public abstract double salario();


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
public boolean pessoaMaiorIdade() {
	return idade >= 18;
}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", numeroCpf=" + numeroCpf + "]";
	}
}
