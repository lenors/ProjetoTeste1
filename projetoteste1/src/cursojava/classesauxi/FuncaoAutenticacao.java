package cursojava.classesauxi;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tenha o contrato da interface PermitirAcesso e chamar a autenticacao*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
