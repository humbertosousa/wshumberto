package br.com.bankofoz.beans;


/*
 * Polimorfismo: quando um elemento age de multiplas formas.
 * Pode ocorrer com:
 * Objeto => em uma herança, onde você cria pelo pai e instancia pelo filho.
 * Exemplo:
 * Conta conta = new Conta();
 * conta=new Corrente();
 * conta=new Poupanca();
 * 
 * Métodos => em duas situações:
 * => Override (sobrescrita) : os métodos possuem o mesmo nome e estão em 
 * classes diferentes (filha e pai)
 * => Overload (sobrecarga) : os métodos estão na mesma classe, a única regra
 * e que eles não podem ter os mesmos parâmetros.
 */
public class Conta {

	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	public void depositar(double valor) {
		if (valor>0) {
			saldo+=valor;
		}
	}
	
	public void sacar(double valor) {
		if (saldo>=valor) {
			saldo-=valor;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	public Conta() {
		super();
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	
	
	
}
