package core.enumera;

public enum Uf {
	AC(0), AL(1), AP(2), AM(3), BA(4), 
	CE(5), DF(6), ES(7), GO(8), MA(9),
	MT(10), MS(11), MG(12), PR(13), PB(14),
	PA(15), PE(16), PI(17), RJ(18), RN(19),
	RS(20), RO(21), RR(22), SC(23), SE(24),
	SP(25), TO(26);
	
	private int id;
	
	Uf(int v){
		this.id = v;
	}
	
	public int getId(){
		return this.id;
	}

}
