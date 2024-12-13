package conta.model;

//Classe Abstrata - Base para criar outras classes
public abstract class Conta {
	
	//Atributos - Variáveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	/*3 Modificadores de acesso (Determina quem pode acessar / encapsulamento)
	 * Private - só os códigos daqui conseguem 
	 * Protected - podem acessar no pacote
	 * Public - qualquer classe pode acessar
	 * */
	
	//Método Especial - Método construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		//this => Classe Conta
		//Conta.numero = atributo
		//numero = 6
		//this.numero = 6
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		
	}
	//Permite que a gente construa um método com valores pré determinados

	//Get - Pegar
	public int getNumero() {
		return numero;
	}
	//Set - Colocar/Setar
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if(this.getSaldo() < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	
	public void depositar(float valor) {
		
		this.setSaldo(this.getSaldo() + valor);
		
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n***********************************");
		System.out.println("Dados da Conta: ");
		System.out.println("***************************************");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		
	}
	//Comportamentos/ Métodos
	
	//Métodos de acesso
	

}
