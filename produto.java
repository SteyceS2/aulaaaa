package ContaBancaria;

public class produto {
private String nome;
private double preco;

public void Produto (String nome, double preco) {
	this.nome = nome;
	setPreco (preco);
}
public String getNome() {
	return nome;
}

public void setNome (String nome) {
	this.nome = nome;
}
	public double getPreco() {
		return preco;
	}
	public void setPreco (double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}else {
			System.out.println("Preço invalido. Não pode ser negativo");
		}
	}
	public void exibirInformacoes() {
		System.out.println("Produto: + nome +, Preço: " + preco);
	}

}