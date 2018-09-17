public class BancoProxy implements InterfaceBanco{

	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

	
	public String getNumeroDeUsuarios() {
	if (temPermissaoDeAcesso()) {
			return new String("Total de usuários: " + quantidadeDeUsuarios);
		}
		return null;
	}

	public String getUsuariosConectados() {
	if (temPermissaoDeAcesso()) {
		return new String("Usuários conectados: " + usuariosConectados);
		}
		return null;
	}
}