package ContaBancaria;

public class contab {
	private double saldo;

	public contab (double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		}else {
			this.saldo = 0;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar (double valor) {
		if(valor>0) {
			saldo += valor;
		} else {
			System.out.println("valor de deposito invalido");
		}
	}
	public void sacar (double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("saque invalido. verifique o valor");
		}
	}
}
