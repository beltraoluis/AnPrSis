package core.enumera;

public enum DocCliente {
	RG(0), CPF(1), CNPJ(2), RNE(3);
	
	private int id;
	
	DocCliente(int v){
		this.id = v;
	}
	
	public int getId(){
		return this.id;
	}

}
