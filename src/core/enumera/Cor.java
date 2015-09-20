package core.enumera;

public enum Cor {
	Branco(0), Preto(1), Vermelho(2), Amarelo(3), Cinza(4), Laranja(5);
	
	private int id;

	private Cor(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
