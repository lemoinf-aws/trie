import aws.lemoinf.Trie;
import aws.lemoinf.Node;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Unit tests for Trie")
public class TrieTests {

	private Trie trie;
	
	@BeforeEach
	void beforeEach() {
		trie = new Trie();

		trie.add("Alemania");
		trie.add("Austria");
		trie.add("Australia");
		trie.add("Zaire");
		trie.add("Zimbawe");
	}

	@Test
	public void autocompleteShouldFindAllWordsStartingWithZ() {
		// arrange
		String word = "Z";

		// act
		String[] actual = trie.autocomplete(word);

		// assert
		String[] expected = { "aire", "imbawe" };

		assertTrue(Arrays.equals(expected, actual));
	}

	@Test
	public void autocompleteShouldFindAllWordsStartingWithAustr() {
		// arrange
		String word = "Austr";

		// act
		String[] actual = trie.autocomplete(word);

		// assert
		String[] expected = { "alia", "ia" };

		assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test
	public void autocompleteShouldReturnNullWhenNoMatch() {
		// arrange
		String word = "Lorem";

		// act
		String[] actual = trie.autocomplete(word);

		// assert
		assertNull(actual);		
	}

	@Test
	public void addShouldSucceed() {
		// arrange
		String word = "Grecia";

		// act
		Node actual = trie.add(word);

		// assert
		assertTrue(actual instanceof Node);;
	}

}
