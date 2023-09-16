package mvc.model;

public class AulaGenerics {

	// Main
	public static void main(String[] args) {
		
		Integer[] idades = {18, 22, 31, 27, 17};
		Double[] alturas = {1.50, 1.77, 1.64, 1.80};
		String[] nomes = {"Vanessa", "Rubens", "Larissa", "Gabriel", "paloma"};
		
		exibir(idades);
		exibir(alturas);
		exibir(nomes);
		
	}
    //metodo para listar os dados dos arrays
	public static <E> void exibir(E[] vetores) {
		for (E elemento : vetores) {
			System.out.println(elemento);
		}

	}
	
}
