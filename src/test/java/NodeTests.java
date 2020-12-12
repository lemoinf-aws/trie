import aws.lemoinf.Node;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Unit tests for Node")
public class NodeTests {

	@Test
	public void addShouldSucceed() {
		// arrange
		Node root = new Node();
		char letter = 'A';

		// act
		Node actual = root.add(letter);

		// assert
		assertTrue(actual instanceof Node);
	}
	
	@Test
	public void getShouldSucceed() {
		// arrange
		Node root = new Node();
		char letter = 'A';

		Node node_a = root.add(letter);

		// act
		Node actual = root.get(letter);

		// assert
		Node expected = node_a;

		assertEquals(expected, actual);		
	}
	
	@Test
	public void allShouldSucceed() {
		// arrange
		Node root = new Node();
		
		Node node_a = root.add('a');
		Node node_b = root.add('b');
		Node node_c = root.add('c');

		Node node_d = node_a.add('d');
		
		node_a.add('e');
		
		node_b.add('f');
		node_b.add('g');
		
		node_c.add('h');
		node_c.add('i');
		
		node_d.add('j');
		node_d.add('k');
		
		// act
		String[] actual = root.all();
		
		// assert
		String[] expected = { "adj", "adk", "ae", "bf", "bg", "ch", "ci" };

		assertTrue(Arrays.equals(expected, actual));
	}

}
