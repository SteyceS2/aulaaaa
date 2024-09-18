package ContaBancaria;

public class TemaObjeto {

	public static void main(String[] args) {
		Tema tema1= new Tema();
		tema1.setId(1);
		tema1.setNome("maria");
		tema1.setValoraluguel(700.00);
		tema1.setCortoalha("azul e amarelo");
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValoraluguel());
		System.out.println(tema1.getCortoalha());
		Tema tema2 = new Tema();
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValoraluguel());
		System.out.println(tema2.getCortoalha());
		

	}

}
