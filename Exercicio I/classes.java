public class AcessaConta {
	
	private String mCPF;
	private List<Conta> mContas;
	
	public Conta(List<Conta> mContas){
		this.mContas = mContas;
	}
	


	public void getInstanceConta(String cpf){
		if(mContas != null){
			for(Conta item : mContas){
			if(item.getmCPF().equal(cpf)){
				return item;
			}
			
			
		} 
		}else{
			/** chama serviço e carrega lista de contas **/
			this.mContas = List<Contas>;
			getInstanceConta(cpf);
		}
		
	}
	
	public boolean deposita(double valor, Conta conta){
		conta.adcionasaldo(double);
		/**chamar serviço passando conta **/
		try{
			system.outprintln(conta.saldo());
			return true;
		}catch{
			return false;
		}
	}
	
	
}


public class Conta{
	private double mSaldo;
	private String mCPF;
	
	public Conta(){
		
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String getmCPF(){
		return mCPF;
	}
	
	public void adicionaSaldo(double valor){
		if(valor > 0){
			saldo = saldo + valor;
		}
		
	}
	
	public void removeSaldo(double valor){
		if(saldo > valor && valor > 0){
			saldo = saldo - valor;
		}
	}
	
	public void tranferencia(Conta conta, double valor){
		conta.adcionasaldo(valor);
	}
}