package aws.lemoinf;

public class Trie {
	private Node root = new Node();

	public Node add(String word) {
		Node node = root;

		for (char letter : word.toCharArray()) {
			Node next = node.get(letter);

			if (next == null) {
				next = node.add(letter);
			}

			node = next;
		}
		
		return node;
	}

	public String[] autocomplete(String word) {
		Node node = root;

		for (char letter : word.toCharArray()) {
			Node next = node.get(letter);

			if (next == null) {
				return null;
			} else {
				node = next;
			}
		}

		return node.all();
	}
}
