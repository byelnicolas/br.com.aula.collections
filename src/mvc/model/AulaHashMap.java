package mvc.model;

import java.util.HashMap;

public class AulaHashMap {

	public static void main(String[] args) {

		// criando um HashMap
		HashMap<String, String> estados = new HashMap<String, String>();

		// Adicionando dados em cada posição do hashMap
		estados.put("Santa Catarina", "florianópolis");
		estados.put("Paraná", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		estados.put("Pará", "Belém");

		// exibindo valor do HashMap
		System.out.println(estados);

		// Exibindo o valor florianópolis
		System.out.println(estados.get("Santa Catarina"));

		// removendo o elemento onde a chave seja paraná
		estados.remove("Paraná");
		System.out.println(estados);
	}
}
