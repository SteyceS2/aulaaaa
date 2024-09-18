package ContaBancaria;

public class Objetocontab {

	public static void main(String[] args) {
	contab conta = new contab (100000.00);
	System.out.println(conta.getSaldo());
	
	conta.depositar(500);
	conta.depositar(1000);
	
	System.out.println(conta.getSaldo());
	
	conta.sacar(1500);
	
	System.out.println(conta.getSaldo());

}
}
