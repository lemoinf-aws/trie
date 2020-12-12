package aws.lemoinf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
	private Map<Character, Node> nodes = new HashMap<>();

	public Node add(char letter) {
		Node node = new Node();

		nodes.putIfAbsent(letter, node);
		return node;
	}

	public Node get(char letter) {
		return nodes.get(letter);
	}

	public String[] all() {
		List<String> words = new ArrayList<>();

		all(this, words, "");
		return words.toArray(new String[words.size()]);
	}

	private void all(Node start, List<String> words, String word) {
		start.nodes.forEach((letter, node) -> {
			if (node.nodes.size() == 0) {
				words.add(word + letter);
			} else {
				all(node, words, word + letter);
			}
		});
	}
}
