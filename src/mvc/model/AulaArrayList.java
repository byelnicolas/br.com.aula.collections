package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {

	public static void main(String[] args) {
		// criando um arraylist de nomes
		List<String> nomes = new ArrayList<String>();

		// cadastrar nomes
		nomes.add("Alice");
		nomes.add("Bianca");
		nomes.add("Caio");
		nomes.add("Denis");
		nomes.add("Ellen");

		// exibir a quantidade de nomes cadastrados
		System.out.println(nomes.size());

		// Percorrendo o arraylist
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();

		// alterar o nome alice para lucas
		nomes.set(0, "lucas");
		// remover o nome
		nomes.remove(4);
		// remover todos os dados do ArrayList
		nomes.clear();

		// for index
		for (int indice = 0; indice < nomes.size(); indice++) {
			System.out.println(nomes.get(indice));
		}
	}
}