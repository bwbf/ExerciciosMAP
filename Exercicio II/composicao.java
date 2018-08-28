


public class Pessoa {
	
	private String mNome;
	private String mEndereco;

	public Pessoa(){
		
	}
	
	public void setNome(String nome){
		this.mNome = nome;
	}
	
	public void setEndereco(String endereco){
		this.mEndereco = endereco;
	}

	public String getNome(){
		return nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
}

public class Tripulacao{
	private int mIdTripulacao;
	private Pessoa mPessoa;
	
	public Tripulacao(Pessoa pessoa, int id){
		this.pessoa = mPessoa;
		this.mIdTripulacao = id;
	}
	
	public void setNome(String nomeCorrigido){
		pessoa.setNome(nomeCorrigido)
	}
	
	public void setEndereco(String enderecoCorrigido){
		pessoa.setEndereco(enderecoCorrigido)
	}
	
	public void setIdTripulacao(int id){
		this.mIdTripulacao = id;
	}
	
	public String getNome(){
		return pessoa.getNome();
	}
	
	public String getEndereco(){
		return pessoa.getEndereco();
	}
	
	public int getId(){
		return mIdTripulacao;
	}
	
	
}

public class Passageiro{
	private int mNumeroSmiles;
	private Pessoa mPessoa;
	
	public Passageiro(Pessoa pessoa, int numeroSmiles){
		this.pessoa = mPessoa;
		this.mNumeroSmiles = numeroSmiles;
	}
	
	public void setNome(String nomeCorrigido){
		pessoa.setNome(nomeCorrigido)
	}
	
	public void setEndereco(String enderecoCorrigido){
		pessoa.setEndereco(enderecoCorrigido)
	}
	
	public void setNumeroSmiles(int id){
		this.mNumeroSmiles = id;
	}
	
	public String getNome(){
		return pessoa.getNome();
	}
	
	public String getEndereco(){
		return pessoa.getEndereco();
	}
	
	public int gettNumeroSmiles(){
		return mNumeroSmiles;
	}
	
	
}

public class Agente{
	private int mIdAgente;
	private Pessoa mPessoa;
	
	public Passageiro(Pessoa pessoa, int idAgente){
		this.pessoa = mPessoa;
		this.mIdAgente = idAgente;
	}
	
	public void setNome(String nomeCorrigido){
		pessoa.setNome(nomeCorrigido)
	}
	
	public void setEndereco(String enderecoCorrigido){
		pessoa.setEndereco(enderecoCorrigido)
	}
	
	public void setIdAgente(int id){
		this.mIdAgente = id;
	}
	
	public String getNome(){
		return pessoa.getNome();
	}
	
	public String getEndereco(){
		return pessoa.getEndereco();
	}
	
	public int getIdAgente(){
		return mIdAgente;
	}
	
	
}