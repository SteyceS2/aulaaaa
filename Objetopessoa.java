package ContaBancaria;

public class Objetopessoa {

	public static void main(String[] args) {
		produto prod = new Produto ("Queijo prato", 50.00);
		
		System.out.println(prod.getNome() + " " + prod.getPreco());
		

		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		prod.setPreco(56);
		System.out.println(prod.getPreco());
		
		prod.setNome("queijo parmesão");
		prod.setPreco(80);
		
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
	}

}
