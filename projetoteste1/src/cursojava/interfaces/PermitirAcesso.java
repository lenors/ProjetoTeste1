package cursojava.interfaces;
/*Essa interface sera o nosso contrato de autenticacao*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	/*Metodo passando parametros de login e senha*/
	public boolean autenticar();
	
}
