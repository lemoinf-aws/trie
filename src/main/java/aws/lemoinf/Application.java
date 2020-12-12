package aws.lemoinf;

import java.util.Scanner;

public class Application {

	public static void main(String args[]) {
		Trie trie = createTrie();

		autocomplete(trie);
	}

	private static Trie createTrie() {
		Trie trie = new Trie();
		String[] words = {
			"Alemania", "Austria", "Australia",
			"Belice", "Brasil", "Egipto",
			"Rusia", "Rumania", "Singapur",
			"Yemen", "Zaire", "Zimbawe"
		};

		for (String word : words) {
			trie.add(word);
		}

		return trie;
	}

	private static void autocomplete(Trie trie) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Prefijo (para terminar, introduce un punto): ");

			String prefix = scanner.nextLine();
			
			if (prefix.equals(".")) {
				break;
			}
			
			String[] words = trie.autocomplete(prefix);

			if (words != null) {
				System.out.println("Sugerencias de autocomplete...");
				for (String word : words) {
					System.out.printf("\t(%s)%s\n", prefix, word);
				}
			} else {
				System.out.println("No se encontró sugerencia alguna");
			}
		}

		scanner.close();
	}

}
