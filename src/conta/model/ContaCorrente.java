package conta.model;

public class ContaCorrente extends Conta{ //extends = herança/herda

	// Atributos - Variáveis
	private float limite;

	// Método Especial - Método construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); //Invocando o método construtor Conta
		this.limite = limite;
	}
	public ContaCorrente (int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	//Métodos de Acesso 
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
    @Override
	
	public void visualizar() {
		super.visualizar(); //Método da Classe Conta
		System.out.println("Limite de créditio: " + this.limite);
	}
	

}
